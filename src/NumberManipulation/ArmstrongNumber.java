package NumberManipulation;

/**
 * Write a program to find the given number is Armstrong number or not?
 *
 * Armstrong numbers are the sum of their own digits to the power of the number of digits.
 * It is also known as narcissistic numbers.
 *
 * Ex : 371 = 3^3 - [27] + 7^3 - [343] + 1^3 - [1]
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        int numberToCheck = 371;
        System.out.println(isArmstrongNumber(numberToCheck));
    }

    private static boolean isArmstrongNumber(int numberToCheck) {
        int numberOfDigits = String.valueOf(numberToCheck).length();
        int total = 0;
        int numberChecking = numberToCheck;
        while (numberToCheck != 0) {
            total += (int)Math.pow(numberToCheck % 10, numberOfDigits);
            numberToCheck = numberToCheck / 10;
        }

        return total == numberChecking;
    }
}
