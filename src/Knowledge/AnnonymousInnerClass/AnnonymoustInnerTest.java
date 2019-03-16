package Knowledge.AnnonymousInnerClass;

public class AnnonymoustInnerTest {
    private static String first = "chamika";
    public static void main(String[] args) {
        String name = "chamika";
        int number = 1;
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void getValue() {
                System.out.println("Abstract Class");
                System.out.println(number);
                System.out.println(first);
            }
        };
        abstractClass.getValue();

        Interface in = new Interface() {
            @Override
            public void getValue() {
                System.out.println("Interface");
            }
        };
        in.getValue();

        ConcreteClass concreteClass = new ConcreteClass(){
            @Override
            public void getValue() {
                System.out.println("Concrete");
            }
        };
        concreteClass.getValue();
    }
}
