package ArrayManipulation.LargetAndSmalletInAnArray;

import java.util.Arrays;

/**
 * How to find largest and smallest number from integer array - Java Solution
 *
 *  Link : http://www.java67.com/2014/02/how-to-find-largest-and-smallest-number-array-in-java.html
 *
 */
public class LargestAndSmallestInAnArray {
    public static void main(String args[]) {
        largestAndSmallest(new int[]{-20, 34, 21, -87, 92, Integer.MAX_VALUE});
        largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
        largestAndSmallest(new int[]{Integer.MAX_VALUE, 40, Integer.MAX_VALUE});
        largestAndSmallest(new gint[]{1, -1, 0});
    }

    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + largest);
        System.out.println("Smallest number in array is : " + smallest);
    }
}
