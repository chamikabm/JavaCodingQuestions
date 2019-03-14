package Knowledge.Threads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.new
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("1"));
        executorService.submit(() -> System.out.println("2"));
        executorService.submit(() -> System.out.println("3"));
        executorService.submit(() -> System.out.println("4"));
        executorService.submit(() -> System.out.println("5"));

        BlockingQueue sharedQ = new LinkedBlockingDeque(5);
    }
}
