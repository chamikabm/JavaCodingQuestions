package Knowledge.Threads.DealLock;

public class DeadLock {
    private static Object Lock1 = "resource1";
    private static Object Lock2 = "resource2";

    public static void main(String[] args) {

        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }

    private static class ThreadOne extends Thread {
        @Override
        public void run() {
            synchronized (Lock1) {
                System.out.println("Thread one holding the resource 1.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread one is waiting for the resource 2.");
                synchronized (Lock2) {
                    System.out.println("Thread one holding both resource one and two.");
                }
            }
        }
    }

    private static class ThreadTwo extends Thread {
        @Override
        public void run() {
            synchronized (Lock2) {
                System.out.println("Thread two holding the resource 2.");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread two is waiting for the resource 1.");
                synchronized (Lock1) {
                    System.out.println("Thread two holding the both resource one and two.");
                }
            }
        }
    }
}
