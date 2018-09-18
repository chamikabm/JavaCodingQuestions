package StringManipulation.Anagrams;

import java.util.Arrays;

/**
 * How to check if two Strings are anagrams of each other?
 *
 * A simple coding problem based upon String, but could also be asked with numbers.
 * You need to write a Java program to check if two given strings are anagrams of Each other.
 * Two strings are anagrams if they are written using the same exact letters, ignoring space,
 * punctuation and capitalization. Each letter should have the same count in both strings.
 * For example, Army and Mary are anagram of each other.
 *
 * Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5RTVxzVhU
 */
public class Anagrams {
    public static void main(String[] args) {
        String stringOne = "Army";
        String stringTwo = "Mary";
        System.out.println(isAnagram(stringOne, stringTwo));
        System.out.println(isAnagram2(stringOne, stringTwo));
    }

    // Time complexity O(N)
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

    //N < M
    // Time complexity O(M)
    private static boolean isAnagram2(String stringOne, String stringTwo) {
        char[] first = stringOne.toLowerCase().toCharArray();
        char[] second = stringTwo.toLowerCase().toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}
