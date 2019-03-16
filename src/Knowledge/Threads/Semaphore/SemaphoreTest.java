package Knowledge.Threads.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;

public class SemaphoreTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(5);

        Runnable longRunningTask = () -> {
            boolean permit = false;
            try {
                int availablePermits = semaphore.availablePermits();
                System.out.println(Thread.currentThread().getName() + " - see " + availablePermits + " permits");
                permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                if (permit) {
                    System.out.println(Thread.currentThread().getName() + " - Semaphore acquired");
                    sleep(5000);
                } else {
                    System.out.println(Thread.currentThread().getName() + " - Could not acquire semaphore");
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } finally {
                if (permit) {
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + " - Semaphore released");
                }
            }
        };

        IntStream.range(0, 10).forEach(i -> executor.submit(longRunningTask));

        executor.shutdown();
    }
}
