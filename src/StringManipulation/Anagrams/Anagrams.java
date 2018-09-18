package StringManipulation.Anagrams;

public class Anagrams {
    public static void main(String[] args) {
        String stringOne = "Army";
        String stringTwo = "Mary";
        System.out.println(isAnagram(stringOne, stringTwo));
    }

    private static boolean isAnagram(String stringOne, String stringTwo) {
        if (stringOne == null || stringTwo == null) {
            return false;
        }

        if (stringOne.isEmpty() || stringTwo.isEmpty()) {
            return false;
        }

        if (stringOne.length() != stringTwo.length()) {
            return false;
        }

        String s1 = stringOne.toLowerCase();
        String s2 = stringTwo.toLowerCase();

        for (int i = 0; i < stringOne.length(); i++) {
            int index = s2.indexOf(String.valueOf(s1.charAt(i)));
            if (index < 0) {
                return false;
            }
        }

        return true;
    }
}
