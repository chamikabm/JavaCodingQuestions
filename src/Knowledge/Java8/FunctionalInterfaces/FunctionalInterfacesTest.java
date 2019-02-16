package Knowledge.Java8.FunctionalInterfaces;

public class FunctionalInterfacesTest {
    public static void main(String[] args) {
        Compute add = (a, b) -> a + b;
        Compute subtract = (a, b) -> a - b;
        Compute multiply = (a, b) -> a * b;

        System.out.println(add.calculate(3, 4));
        System.out.println(subtract.calculate(3, 4));
        System.out.println(multiply.calculate(3, 4));
    }
}
