package Knowledge.Threads.ProducerConsumer.WaitAndNotify;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    private final Queue sharedQ;
    private int maxSize;

    public Producer(Queue sharedQ, int maxSize) {
        this.sharedQ = sharedQ;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        while(true) {
            synchronized (sharedQ) {
                while(sharedQ.size()==maxSize) {
                    try {
                        System.out.println("Queue is full");
                        sharedQ.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                Random random = new Random();
                int number = random.nextInt(100);
                System.out.println("Producing value " + number);
                sharedQ.add(number);
                sharedQ.notify();
            }
        }
    }
}
