package Knowledge.Threads.Startvation;

import java.util.stream.IntStream;

public class Starvation {

    public static void main(String[] args) {
        Worker worker = new Worker();
        IntStream.range(0, 10).forEach(i -> new Thread(() -> worker.work()).start());
    }
}
