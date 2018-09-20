package StringManipulation.CountVowelsAndConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * How to count number of vowels and consonants in a String?
 *
 * One of easiest String question you will ever see. You have to write a Java program which will take a String input
 * and print out number of vowels and consonants on that String. For example if input is “Java” then your program
 * should print “2 vowels and 2 consonants”. If you get this question on Interview, you should clarify that whether
 * String can contain numbers, special characters or not e.g. anything other than vowels and consonants.
 */
public class CountVowelsAndConstants {

    public static void main(String[] args) {
        String stringToCountVowels = "chamika";
        printVowelsCount(stringToCountVowels);

        System.out.println();

        String stringToCountConstants = "sdf87434(&^%^&";
        printConstantsCount(stringToCountConstants);

        System.out.println();

        printCharactersCount(stringToCountConstants);
    }

    private static void printVowelsCount(String stringToCountVowels) {
        Map<Character, Integer> vowelsCountMap = new HashMap<>();
        vowelsCountMap.put('a',    0);
        vowelsCountMap.put('e',    0);
        vowelsCountMap.put('i',    0);
        vowelsCountMap.put('o',    0);
        vowelsCountMap.put('u',    0);

        for (Character c : stringToCountVowels.toLowerCase().toCharArray()) {
            if (vowelsCountMap.containsKey(c)) {
                vowelsCountMap.put(c, vowelsCountMap.get(c) + 1);
            }
        }

        for (Entry entry: vowelsCountMap.entrySet()) {
            if ((Integer)entry.getValue() > 0) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    // Unicode table : https://www.utf8-chartable.de/unicode-utf8-table.pl?utf8=dec&unicodeinhtml=dec
    private static void printConstantsCount(String stringToCountConstants) {
        Map<Character, Integer> constantsMap = new HashMap<>();
        for (Character c : stringToCountConstants.toLowerCase().toCharArray()) {
            int unicodeVale = c;
            if ((unicodeVale > -1 && unicodeVale < 65) || (unicodeVale > 90 && unicodeVale < 97) || unicodeVale > 122) {
                if (constantsMap.containsKey(c)) {
                    constantsMap.put(c, constantsMap.get(c) + 1);
                } else {
                    constantsMap.put(c, 1);
                }
            }
        }

        for (Entry entry : constantsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    // Unicode table : https://www.utf8-chartable.de/unicode-utf8-table.pl?utf8=dec&unicodeinhtml=dec
    private static void printCharactersCount(String stringToCountConstants) {
        Map<Character, Integer> constantsMap = new HashMap<>();
        for (Character c : stringToCountConstants.toLowerCase().toCharArray()) {
            int unicodeVale = c;
            if ((unicodeVale <= 90 && unicodeVale >= 65 ) || (unicodeVale <= 122 && unicodeVale >= 97 )) {
                if (constantsMap.containsKey(c)) {
                    constantsMap.put(c, constantsMap.get(c) + 1);
                } else {
                    constantsMap.put(c, 1);
                }
            }
        }

        for (Entry entry : constantsMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
