package Knowledge.Java8.DefaultMethods.MultipleInheritance;

public class ConcreteClass implements Interface1, Interface2 {

    @Override
    public void show() {
        Interface1.super.show();
        Interface2.super.show();
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.show();
    }
}
