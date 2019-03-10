package Knowledge.Threads.ThreadCreate;

public class TestClass {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyClass());
        thread.start();

        MyThreadClass myThreadClass = new MyThreadClass();
        myThreadClass.start();
    }
}
