package Sorting.MergeSort;

public class MergeSortSimple {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 76, 78, 99 ,55, 66};
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // find middle index.
            int m = (l + r) / 2;

            // Sort 1st and 2nd Halves.
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves.
            merge(arr, l , m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        // Sub array sizes
        int n1 = (m - l) + 1;
        int n2 = (r - m);

        // Create temp arrays.
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy array to sub arrays.
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Initial index of 1st and 2nd arrays.
        int i = 0;
        int j = 0;

        // Initial index of merged array
        int k = l;

        // Compare and sort elements in sub arrays.
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
