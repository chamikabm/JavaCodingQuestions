package Knowledge.Threads.ProducerConsumer.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerBQ {
    public static void main(String[] args) {
        BlockingQueue sharedQ = new LinkedBlockingDeque();
        Thread consumer = new Thread(new ConsumerBQ(sharedQ), "CONSUMER");
        Thread producer = new Thread(new ProducerBQ(sharedQ), "PRODUCER");

        producer.start();
        consumer.start();
    }
}
