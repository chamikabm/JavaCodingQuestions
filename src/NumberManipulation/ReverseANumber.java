package NumberManipulation;

public class ReverseANumber {

    public static void main(String[] args) {
        int numberToReverse = 4568;
        System.out.println(reverseNumber(numberToReverse));
        System.out.println(reverseNumber2(numberToReverse));
    }

    private static int reverseNumber(int numberToReverse) {
        String number = String.valueOf(numberToReverse);
        int reversedNumber = 1;

        for (int i = number.length() -1; i >0; i--) {
            reversedNumber += Integer.parseInt(String.valueOf(number.charAt(i))) * Math.pow(10, i);
        }

        return reversedNumber;
    }

    private static int reverseNumber2(int numberToReverse) {
        int reversedNumber = 0;
        while (numberToReverse != 0 ) {
            reversedNumber = reversedNumber*10 + numberToReverse % 10;
            numberToReverse = numberToReverse / 10;
        }


        return reversedNumber;
    }
}
