package StringManipulation.ReverseStringWithRecusive;

/**
 * Program: Write a program to reverse a string using recursive algorithm.
 *
 * Link : http://www.java2novice.com/java-interview-programs/string-reverse-recursive/
 *
 * Description:
 *
 * Write a program to reverse a string using recursive methods.
 * You should not use any string reverse methods to do this.
 *
 */
public class ReverseAStringWitchReclusive {

    String reverse = "";

    public String reverseString(String str){

        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

    public static void main(String a[]){
        ReverseAStringWitchReclusive srr = new ReverseAStringWitchReclusive();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
        System.out.println(reverseString2("Java2novice"));
    }

    public static String reverseString2(String str) {
        //

        if (str == null || str.length() <= 1) {
            return str;
        }

        return str.substring(str.length() - 1) + reverseString2(str.substring(0, str.length() - 1));
    }
}
