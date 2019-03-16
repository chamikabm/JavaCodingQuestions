package Knowledge.Threads.Startvation;

public class Worker {
    public synchronized void work() {
        String name = Thread.currentThread().getName();



        while (true) {
            System.out.println(name + " is working");
        }
    }
}
