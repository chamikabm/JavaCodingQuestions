package StringManipulation.StringRevers;

/**
 * How to reverse String in Java using Iteration and Recursion? (solution)
 * Your task is to write a program to reverse String in Java without using StringBuffer class.
 * You also need to provide both iterative and recursive algorithm for String reversal.
 * You can use other String utility methods e.g. charAt(), toCharArray() or substring() from java.lang.String class.
 *
 * Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5RTWMJfZ2
 */
public class StringRevers {

    public static void main(String[] args) {
        String stringToReverse = "Chamika";
        System.out.println(getReversedString(stringToReverse));
        System.out.println(getReversedString2(stringToReverse));
        System.out.println(getReversedString3(stringToReverse));
        System.out.println(getReversedString4(stringToReverse));
    }

    //This is optional not related to the above question.
    private static String getReversedString(String stringToReverse) {
        return new StringBuilder(stringToReverse).reverse().toString();
    }

    // Using iterations
    private static String getReversedString2(String stringToReverse) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = stringToReverse.length() -1; i >=0; i--) {
            reversedString.append(stringToReverse.charAt(i));
        }

        return reversedString.toString();
    }

    // Using iterations
    private static String getReversedString3(String stringToReverse) {
        char[] chars = new char[stringToReverse.length()];
        for (int i = stringToReverse.length() -1; i >=0; i--) {
            chars[stringToReverse.length() - 1 - i] = stringToReverse.charAt(i);
        }

        return new String(chars);
    }

    // Using recursive algorithm
    private static String  getReversedString4(String stringToReverse) {

        if (stringToReverse.length() == 1) {
            return stringToReverse;
        }

        return getReversedString4(stringToReverse.substring(1)) + stringToReverse.charAt(0);
    }
}
