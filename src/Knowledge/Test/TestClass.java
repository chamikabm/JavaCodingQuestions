package Knowledge.Test;

import java.io.IOException;

public class TestClass  extends SimpleClass {



    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.printName();

        try {
            test();
        } catch (Exception e) {
            e = new Exception("");
            e.printStackTrace();
        }

        try {
            test();
        } catch (IllegalArgumentException | StackOverflowError e) {
//            e = new StackOverflowError("");
            e.printStackTrace();
            System.out.println(e);
        } catch (Exception e) {
            e = new Exception("");
            e.printStackTrace();
        }
    }

    //Cannot override final class methods.
//    public void printName(String name) {
//        System.out.println("chamika");
//    }

    @Override
    public void simpleMethod() throws NumberFormatException {
        System.out.println("complex");
    }

    public static void test() throws IllegalArgumentException, StackOverflowError {
        System.out.println("complex");
    }
}
