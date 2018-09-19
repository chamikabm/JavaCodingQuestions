package StringManipulation.FirstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * How to program to print first non repeated character from String? (solution)
 * <p>
 * One of the most common string interview questions: Find the first non-repeated (unique) character in a given string.
 * for Example if given String is “Morning” then it should print “M”. This question demonstrates efficient use
 * of Hashtable. We scan the string from left to right counting the number occurrences of each character in a Hashtable.
 * Then we perform a second pass and check the counts of every character. Whenever we hit a count of 1 we return
 * that character, that’s the first unique letter. Be prepared for follow-up question for improving memory efficiency,
 * solving it without hash table as well.
 */
public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String stringToCheck = "mmmmorning";
        System.out.println(printFirstNonRepeatedCharacter(stringToCheck));
    }

    private static Character printFirstNonRepeatedCharacter(String stringToCheck) {
        Map<Character, Integer> counts = new LinkedHashMap<>(stringToCheck.length());
        for (char c : stringToCheck.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("didn't find any non repeated Character");
    }
}
