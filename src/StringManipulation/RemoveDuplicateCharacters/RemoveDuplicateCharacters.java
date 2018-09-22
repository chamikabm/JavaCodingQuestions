package StringManipulation.RemoveDuplicateCharacters;

import java.util.*;

/**
 * How to remove duplicate characters from String?
 *
 * This is one of the interesting String question, which also has lots of variants. You need to remove duplicate
 * characters from a given string keeping only the first occurrences. For example, if the input is ‘bananas’ the
 * output will be ‘bans’. Pay attention to what output could be, because if you look closely original order of
 * characters are retained the in output. This is where many developer make the a mistake of shorting character
 * array of String and removing duplicates, similar to how you remove duplicates from array. That destroys original
 * order of characters and will not be correct solution in this case.
 *
 */
public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String stringToFindDuplicates = "bananas";
        System.out.println(removeDuplicateCharacters(stringToFindDuplicates));
    }

    private static String removeDuplicateCharacters(String stringToFindDuplicates) {
        List<Character> characterList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (Character currentCharacter: stringToFindDuplicates.toLowerCase().toCharArray()) {
            if (!characterList.contains(currentCharacter)) {
                characterList.add(currentCharacter);
                sb.append(currentCharacter.toString());
            }
        }

        return sb.toString();
    }
}
