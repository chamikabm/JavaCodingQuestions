public class Main {

    public static void main(String[] args) {
        String testString = "aba";
        System.out.println(isPalindrome(testString));
        System.out.println(isPalindrome2(testString));
    }

    private static boolean isPalindrome(String str) {
        char[] charactersArray = str.toCharArray();
        for(int i=0; i < charactersArray.length/2; i++) {
            if(charactersArray[i] != charactersArray[charactersArray.length -  1 - i]) {
                return  false;
            }
        }

        return true;
    }

    private static boolean isPalindrome2(String testString) {
        return new StringBuilder(testString).reverse().toString().equals(testString);
    }
}
