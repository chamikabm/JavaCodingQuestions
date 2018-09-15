package StringManipulation.Palindrome;

public class Palindrome {

    public static void main(String[] args) {
        String stringToCheck = "AA";
        System.out.println(isPalindrome(stringToCheck));
    }

    private static boolean isPalindrome (String stringToCheck) {
        if (stringToCheck == null || stringToCheck.isEmpty()) {
            return false;
        } else {
            int stringLength = stringToCheck.length() - 1;
            char[] strings = stringToCheck.toCharArray();
            for (int i = 0; i <= stringLength/2; i++) {
                if (strings[i] != strings[stringLength-i]) {
                    return false;
                }
            }

            return  true;
        }
    }
}
