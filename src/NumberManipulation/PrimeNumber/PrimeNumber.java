package NumberManipulation.PrimeNumber;

/**
 * A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * A natural number greater than 1 that is not a prime number is called a composite number. For example, 5 is prime,
 * as only 1 and 5 divide it, whereas 6 is composite, since it has the divisors 2 and 3 in addition to 1 and 6.
 * The fundamental theorem of arithmetic establishes the central role of primes in number theory: any integer greater
 * than 1 can be expressed as a product of primes that is unique up to ordering.
 * This theorem requires excluding 1 as a prime.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int numberToCheck = 1;
        System.out.println(isPrimeNumber(numberToCheck));
    }

    private static boolean isPrimeNumber(int numberToCheck) {
        if (numberToCheck < 1) {
            return false;
        }

        if (numberToCheck == 1) {
            return true;
        }

        int divider = numberToCheck;

        while (--divider != 1) {
            if (numberToCheck%divider == 0) {
                return false;
            }
        }

        return true;
    }
}
