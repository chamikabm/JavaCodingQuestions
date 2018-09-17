package StringManipulation.DuplicateCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
