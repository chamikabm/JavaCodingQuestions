package Knowledge.Java8.MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class MethodReferencesTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Chamika");
        names.add("Kasun");
        names.add("Bandara");

        // Using lambda expressions.
        System.out.println("Using lambda expressions.");
        names.forEach(name -> System.out.println(name));

        System.out.println();

        // Using functional references.
        System.out.println("Using method references.");

        //Here we have passed System.out::println method as a static method reference.
        names.forEach(System.out::println);
    }
}
