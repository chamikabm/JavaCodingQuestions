package Knowledge.ForkJoinFramework;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import static java.util.stream.Collectors.toList;

public class SumAction extends RecursiveAction {

    private static final int SEQUENTIAL_THRESHOLD = 5;
    private List<Long> data;

    public SumAction(List<Long> data) {
        this.data = data;
    }

    @Override
    protected void compute() {
        if (data.size() <= SEQUENTIAL_THRESHOLD) { // base case
            long sum = computeSumDirectly();
            System.out.format("Sum of %s: %d\n", data.toString(), sum);
        } else { // recursive case
            // Calcuate new range
            int mid = data.size() / 2;
            SumAction firstSubTask = new SumAction(data.subList(0, mid));
            SumAction secondSubTask = new SumAction(data.subList(mid, data.size()));

            firstSubTask.fork(); // queue the first task
            secondSubTask.compute(); // compute the second task
            firstSubTask.join(); // wait for the first task result

            // Or simply call
            //invokeAll(firstSubTask, secondSubTask);
        }
    }

    private long computeSumDirectly() {
        long sum = 0;
        for (Long l: data) {
            sum += l;
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<Long> data = random
                .longs(10, 1, 10)
                .boxed()
                .collect(toList());
        System.out.println(data.toString());

        ForkJoinPool pool = new ForkJoinPool();
        SumAction task = new SumAction(data);
        pool.invoke(task);
    }
}
