package Sorting.BubbleSort;

public class BubbleSortingOptimized {

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

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        bubble_srt(input);
    }
}
