package ArrayManipulation.ReverseAnArray;

import java.util.Arrays;

/**
 * http://www.java67.com/2016/01/java-program-to-reverse-array-in-place.html
 *
 * Java Program to reverse an array in place? Fastest Example
 *
 * It's easy to reverse an array if you have the luxury to use another array,
 * but how would you reverse an array if a temporary buffer is not allowed?
 *
 *
 * This is a simple algorithm and time complexity is O(n/2) or O(n) because it needs to iterate over
 * almost half the elements and perform n/2 swapping as well. The space complexity of the algorithm is O(1)
 * because no matter how big the array is, it requires same space. Obviously, all in place algorithms
 * has constant space complexity.
 *
 * This is also the fastest way to reverse an array in Java.
 *
 *
 *
 *
 */
public class ReverseAnArrayInPlace {

    public static void main(String[] args) {
        String[] names = {"John", "Jammy", "Luke"};
        System.out.println("original array: " + Arrays.toString(names) );

        // reversing array with three elements
        reverse(names);
        System.out.println("reversed array: " + Arrays.toString(names) );
        String[] test = {"John"};
        System.out.println("original array: " + Arrays.toString(test) );

        // testing reverse array function with array of just one element
        reverse(test);
        System.out.println("reversed array: " + Arrays.toString(test) );
    }

    /** * Java Method to reverse String array in place * * @param array */
    private static void reverse(String[] array) {
        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
