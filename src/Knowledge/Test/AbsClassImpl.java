package Knowledge.Test;

public class AbsClassImpl extends AbsClass {
    @Override
    void printName() {
        System.out.println("name");
        System.out.println(super.getName());
    }
}
