package Knowledge.Test.Threads.waitNotify;

public class ThreadB extends Thread {

    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                total += 1;
            }
            notify();
        }
    }

}
