package NumberManipulation.PrimeNumber;

/**
 * Prime Number Definition:
 * <p>
 * A prime number (or a prime) is a natural number greater than 1 that cannot be formed by multiplying two smaller
 * natural numbers. A natural number greater than 1 that is not prime is called a composite number. For example,
 * 5 is prime, as only 1 and 5 divide it, whereas 6 is composite, since it has the divisors 2 and 3 in
 * addition to 1 and 6.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int numberToCheck = 4;
        System.out.println(isPrimeNumber(numberToCheck));
        System.out.println(isPrimeNumber2(numberToCheck));
    }

    private static boolean isPrimeNumber(int numberToCheck) {
        if (numberToCheck <= 2) {
            return false;
        }

        int divider = numberToCheck;
        while (--divider != 1) {
            if (numberToCheck % divider == 0) {
                return false;
            }
        }

        return true;
    }

    private static boolean isPrimeNumber2(int numberToCheck) {
        if (numberToCheck <= 2) {
            return false;
        }

        int sqrt = (int) Math.sqrt(numberToCheck) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

}
