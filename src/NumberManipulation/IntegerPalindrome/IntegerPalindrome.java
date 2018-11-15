package NumberManipulation.IntegerPalindrome;

/**
 * An integer is called palindrome if its equal to its reverse
 *
 * e.g. 1001 is a palindrome but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.
 *
 */
public class IntegerPalindrome {

    public static void main(String[] args) {
        int number = 1001;
        System.out.println(isPalindromeNumber(number));

        int number2 = 1234;
        System.out.println(isPalindromeNumber(number2));

        int number3 = 1;
        System.out.println(isPalindromeNumber(number3));
    }

    private static boolean isPalindromeNumber(int number) {

        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            reverse = reverse*10 + palindrome%10;
            palindrome = palindrome/10;
        }

        return number == reverse;
    }
}
