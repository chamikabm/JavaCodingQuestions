package ArrayManipulation.RemoveDuplicatesInPlace;

import java.util.Arrays;

/**
 *  Link : https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html
 *
 *This is a coding question recently asked to one of my readers in a Java Technical interview. Question was to remove duplicates from an integer array without using any collection API classes like Set or LinkedHashSet, which can make this task trivial. In general, if you need to do this for any project work, I suggest better using Set interface, particularly LinkedHashSet, because that also keep the order on which elements are inserted into Set. Only for technical interview perspective, you need to do this using either loops or recursion,  depending upon what is your strongest area. In this article, I am sharing a naive solution, which has lots of limitation to be considered as production quality code, It's not the best solution but still a solution.
 *
 */
public class RemoveDuplicatesInPlace {

    public static void main(String args[]) {

        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }
    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }
}
