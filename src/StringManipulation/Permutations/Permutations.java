package StringManipulation.Permutations;

/**
 *
 * How to find all permutations of String?
 *
 * I have seen this String interview question on many interviews. It has a easy recursive solution but thinks get
 * really tricky when Interviewer ask you to solve this question without using recursion. You can use Stack though.
 * Write a program to print all permutations of a String in Java, for example, the if input is "xyz" then
 * it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".
 *
 */
public class Permutations {

    public static void main(String[] args) {
        String stringToFindPermutations = "xyz";
        printAllPermutations(stringToFindPermutations);
    }

    private static void printAllPermutations(String stringToFindPermutations) {
        permutation("", stringToFindPermutations);
    }

    /* * Recursive method which actually prints all permutations * of given String, but since we are passing an empty
    String * as current permutation to start with, * I have made this method private and didn't exposed it to client. */
    private static void permutation(String perm, String word)
    {
        if (word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i< word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }
}
