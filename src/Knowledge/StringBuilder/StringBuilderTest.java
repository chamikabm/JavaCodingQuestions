package Knowledge.StringBuilder;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de"); //  StringBuilder changes its own state and returns a reference to itself!
        b = b.append("f").append("g");

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
