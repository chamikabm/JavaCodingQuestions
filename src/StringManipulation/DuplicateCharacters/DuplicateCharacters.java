package StringManipulation.DuplicateCharacters;

// This is a O(max(N,M)) solution as this has two for loops running.

import java.util.HashMap;
import java.util.Map;

/**
 * How to Print duplicate characters from String?
 *
 * To start with, we have a simple String related coding question frequently asked in programming interviews.
 * You need to write a program in C, C++, Java or Python to print duplicate characters from a given String,
 * for example if String is "Java" then program should print "a".
 * Bonus points if your program is robust and handle different kinds of input e.g. String without duplicate,
 * null or empty String etc. Bonus points if you also write unit tests for normal and edge cases.
 *
 * Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5RTWAiSxr
 */
public class DuplicateCharacters {

    public static void main(String[] args) {
        String stringToFindDuplicates = "abcabc";
        printDuplicateCharacters(stringToFindDuplicates);
    }

    private static void printDuplicateCharacters(String stringToFindDuplicates) {
        Map<String, Integer> stringMap = new HashMap<>();

        for (int i =0; i < stringToFindDuplicates.length(); i++) {
            String currentStringCharacter = String.valueOf(stringToFindDuplicates.charAt(i));
            if (stringMap.containsKey(currentStringCharacter)) {
                stringMap.put(currentStringCharacter, stringMap.get(currentStringCharacter) + 1);
            } else {
                stringMap.put(currentStringCharacter, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
