package OtherCommonQuestions.SmallestPositiveInteger;

import java.util.Arrays;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositiveInteger {

    public static void main(String[] args) {
        int[] intArray = new int[]{ -1, -3};
        System.out.println(getSmallestInteger(intArray));
    }


    public static int getSmallestInteger(int[] numbers) {
        Arrays.sort(numbers); // Sort the array.'
        System.out.println(Arrays.toString(numbers));
        for (int i=0; i< numbers.length; i++) {
            if (i >= 1) {
                int diff = Math.abs(numbers[i-1] - numbers[i]);
                if (diff > 1) {
                    if (numbers[i-1] < 0) {
                        return 1;
                    }
                    return numbers[i-1] + 1;
                }
            }
        }

        return numbers[numbers.length -1] + 1;
    }
}
