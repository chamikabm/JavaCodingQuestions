package StringManipulation.ConvertNumberStringToInt;

/**
 *  How to convert numeric String to int? (solution)
 * A classical coding interview question based upon String. You need to write a method like atoi() from C/C++,
 * which takes a numeric String and return its int equivalent. For example, if you pass “67263” to the program then it
 * should return 67263. Make sure your solution is robust i.e. it should be able to handle + and – character,
 * null and empty String, integer overflow and other corner cases. Bonus points if you come up with good unit test cases.
 * By the way, if your interviewer doesn’t mention to you about atoi() then you can also use Java API’s parseInt()
 * or valueOf() method to solve this problem.
 */
public class ConvertNumberStringToInt {

    public static void main(String[] args) {
        String numberStringToConvertToInt = "1234";
        System.out.println(printIntValueOfNumberString(numberStringToConvertToInt));
        System.out.println();
        System.out.println(printIntValueOfNumberString2(numberStringToConvertToInt));
        System.out.println();
        System.out.println(printIntValueOfNumberString3(numberStringToConvertToInt));
    }

    // Simple Solution 1
    private static int printIntValueOfNumberString(String stringToConvertToInt) {
        return Integer.parseInt(stringToConvertToInt);
    }

    // Simple Solution 2
    private static int printIntValueOfNumberString2(String stringToConvertToInt) {
        return Integer.valueOf(stringToConvertToInt);
    }

    private static int printIntValueOfNumberString3(String stringToConvertToInt) {
        double presentedVale = 0;
        for (int i = 1; i <= stringToConvertToInt.length(); i++) {
            Character c = stringToConvertToInt.charAt(i-1);
            int unicodeValue = c;
            int integerValue = unicodeValue - 48;
            presentedVale += integerValue * Math.pow(10, stringToConvertToInt.length() - i);
        }

        return (int)presentedVale;
    }
}
