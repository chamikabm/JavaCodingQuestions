package Knowledge.Threads.ProducerConsumer.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ConsumerBQ implements Runnable{
    private final BlockingQueue sharedQ;

    public ConsumerBQ(BlockingQueue sharedQ) {
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consuming : " + sharedQ.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
