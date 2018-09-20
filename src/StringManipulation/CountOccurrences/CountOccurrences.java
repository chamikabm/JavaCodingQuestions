package StringManipulation.CountOccurrences;

import java.util.HashMap;
import java.util.Map;

/**
 * How to count occurrence of a given character in String?
 *
 * If interviewer ask you to count occurrence of more than one character than you can either use an array, hash table
 * or any additional data structure. In order to solve this problem, you are not allowed to do so. Your method must
 * return count of given character, for example if input String is “Java” and given character
 * is ‘a’ then it should return 2. Bonus point if you handle case, null and empty String and come up with unit tests.
 */
public class CountOccurrences {

    public static void main(String[] args) {
        String stringToCountCharacters = "Chamikacccc";
        Character character = 'C';
        System.out.println(getCharacterCount(stringToCountCharacters, character));
        System.out.println();
        System.out.println(getCharacterCount2(stringToCountCharacters, character));
    }

    private static int getCharacterCount(String stringToCountCharacters, Character character) {

        Map<Character, Integer> characterCountMap = new HashMap<>();
        characterCountMap.put(Character.toLowerCase(character), 0);
        for (Character c : stringToCountCharacters.toLowerCase().toCharArray()) {
            if (characterCountMap.containsKey(c)) {
                characterCountMap.put(c, characterCountMap.get(c) + 1);
            }
        }

        return characterCountMap.get(Character.toLowerCase(character));
    }

    private static int getCharacterCount2(String stringToCountCharacters, Character character) {

        int characterCount = 0;
        for (Character c : stringToCountCharacters.toLowerCase().toCharArray()) {
            if (c == Character.toLowerCase(character)) {
                characterCount++;
            }
        }

        return characterCount;
    }
}
