package Knowledge.Threads.ProducerConsumer.BlockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerBQ implements Runnable {
    private final BlockingQueue sharedQ;

    public ProducerBQ(BlockingQueue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            int num = random.nextInt(10);
            System.out.println("Producing  : "+num);
            sharedQ.add(num);
        }
    }
}
