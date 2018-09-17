package StringManipulation.DuplicateCharacters;

// This is a O(max(N,M)) solution as this has two for loops running.

import java.util.HashMap;
import java.util.Map;

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
