package Sorting.BubbleSort;

import java.util.Arrays;
import java.util.List;

public class BubbleSortSimple {

    public static void bubble_srt(int array[]) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]) {
                    swapNumbers(j , j -1, array);
                }
            }
        }

        printNumbers(array);
    }

    private static void swapNumbers(int current, int previous, int[] array) {
        int temp = array[current];
        array[current] = array[previous];
        array[previous] = temp;
    }

    private static void printNumbers(int[] input) {
        Integer[] what = Arrays.stream(input).boxed().toArray(Integer[]::new);
        List<Integer> arr = Arrays.asList(what);
        StringBuilder p = new StringBuilder("");
       for (int a : arr ) {
            p.append(a).append(",");
       }
        System.out.println(p);
    }

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
    }
}
