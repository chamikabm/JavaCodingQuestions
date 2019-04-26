package CodingTests;

import java.util.HashSet;
import java.util.Set;

/**
 * Kate was given a birthday gift of three theater tickets. Now she is browsing the theater program for the next N days. On the program, performances are named by integers. Every day, one performance is staged. Kate wants to choose three days (not necessarily consecutive) to go to the theater.
 *
 * In how many ways can she use her tickets? Two ways are different if the sequences of watched performances are different. Kate likes the theater, so she may watch one performance more than once. For example, if N = 4 and theater program looks as following: [1, 2, 1, 1], Kate has four possibilities to choose the dates: [1, 2, 1, 1], [1, 2, 1, 1], [1, 2, 1, 1], and [1, 2, 1, 1], but they create only three different sequences: (1, 2, 1), (1, 1, 1) and (2, 1, 1). The correct answer for this example is 3. Notice that the order of performances matters, so the first and the last sequences are considered different.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, denoting names of performances for the next N days, returns the number of possible ways to spend the tickets. Since the answer can be very large, provide it modulo 109 + 7 (1,000,000,007).
 *
 * For example, given A = [1, 2, 1, 1], the function should return 3 as exmplained above.
 *
 * Given A = [1, 2, 3, 4], the function should return 4. There are four ways to spend tickets: (1, 2, 3), (1, 2, 4), (1, 3, 4) and (2, 3, 4).
 *
 * Given A = [2, 2, 2, 2], the function should return 1. There is only one way to spend tickets: (2, 2, 2).
 *
 * Given A = [2, 2, 1, 2, 2], the function should return 4. There are four ways to spend tickets: (1, 2, 2), (2, 1, 2), (2, 2, 1) and (2, 2, 2).
 *
 * Given A = [1, 2], the function should return 0. Kate cannot use all three tickets in only two days.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [0..100,000];
 * each element of array A is an integer within the range [1..N].
 */
public class TheaterTicketsProblemGrab {

    public static void main(String[] args) {
        TheaterTicketsProblemGrab tp = new TheaterTicketsProblemGrab();
        int a[] = { 1, 2 };
        System.out.println(tp.solution(a));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        int r = 3;
        int n = A.length;

        return printCombination(A, n, r);
    }

    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */
    void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r, Set<String> ss) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            String a = "";
            for (int j=0; j<r; j++) {
                a = a.concat(String.valueOf(data[j]));
            }

            ss.add(a);
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i+1, end, index+1, r, ss);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    int printCombination(int[] arr, int n, int r) {
        // A temporary array to store all combination one by one
        int data[]=new int[r];
        Set<String> ss = new HashSet<>();

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n-1, 0, r, ss);
        return ss.size();
    }
}
