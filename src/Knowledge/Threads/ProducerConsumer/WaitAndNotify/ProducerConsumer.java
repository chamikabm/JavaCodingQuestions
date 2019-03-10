package Knowledge.Threads.ProducerConsumer.WaitAndNotify;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    public static void main(String[] args) {

        final Queue sharedQ = new LinkedList < Integer >();

        Thread consumerThread = new Thread(new Consumer(sharedQ, 4), "CONSUMER");
        Thread producerThread = new Thread(new Producer(sharedQ, 4), "PRODUCER");

        producerThread.start();
        consumerThread.start();
    }
}
