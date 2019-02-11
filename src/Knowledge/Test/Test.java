package Knowledge.Test;

public class Test {

    public static void main(String[] args) {
//        AbsClassImpl absClass = new AbsClassImpl();
//        absClass.printName();

        String s = "a/b/c/d";
        String[] a1 = s.split("/");
        System.out.println("split string using only regex:");
        for (String string : a1) {
            System.out.println(string);
        }
        System.out.println("split string using regex with limit:");
        String[] a2 = s.split("/", 2);
        for (String string : a2) {
            System.out.println(string);
        }

        String a = "chamika";
        String b = "chamika";
        String c = new String("chamika");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println("chhhh");
        System.out.println(a.substring(0, a.length() -1));
    }
}
