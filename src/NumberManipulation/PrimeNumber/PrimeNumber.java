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
        int numberToCheck = 9;
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

    /**
     *
     If a number n is not a prime, it can be factored into two factors a and b:

     n = a*b

     If both a and b were greater than the square root of n, a*b would be greater than n.
     So at least one of those factors must be less than or equal to the square root of n, and to check if n is prime,
     we only need to test for factors less than or equal to the square root.

     Summary :

     Because if n = a*b and a <= b then a*a <= a*b = n
     To clarify, this means we have to test only till floor(sqrt(n))

     * @param numberToCheck
     * @return
     */
    private static boolean isPrimeNumber2(int numberToCheck) {
        if (numberToCheck <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }

        return true;
    }

}
