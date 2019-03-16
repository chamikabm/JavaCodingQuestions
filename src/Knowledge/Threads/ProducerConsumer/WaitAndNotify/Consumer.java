package Knowledge.Threads.ProducerConsumer.WaitAndNotify;

import java.util.Queue;

public class Consumer extends Thread {
    private final Queue sharedQ;
    private int maxSize;

    public Consumer(Queue sharedQ, int maxSize) {
        this.sharedQ = sharedQ;
        this.maxSize = maxSize;
    }

    @Override
    public void run(){
        while(true) {
            synchronized (sharedQ) {
                while(sharedQ.isEmpty()) {
                    try {
                        System.out.println("Queue is Empty");
                        sharedQ.wait();
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int number = (int) sharedQ.poll();
                System.out.println("removing Element " + number);
                sharedQ.notify();
            }
        }
    }
}
