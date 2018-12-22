package NumberManipulation.FindAllPairsOfNumWithSum;

/**
 * Problem :
 *
 * Link : https://javaconceptoftheday.com/how-to-find-all-pairs-of-elements-in-an-array-whose-sum-is-equal-to-a-given-number/
 *
 * Given an array of integers, you have to find all pairs of elements in this array such that whose sum must
 * be equal to a given number.
 *
 * For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
 * then you have to find all pairs of elements in this array whose sum must be 20. In this example,
 * (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
 *
 * We use brute-force method to solve this problem. We take one element at a time and search for other
 * element such that they add up to a given number. For this, we use two for loops to iterate through the elements.
 * We print such pairs of elements whose sum is equal to a given number. This method works for both positive
 * and negative numbers and also for unsorted array.
 *
 *
 * https://stackoverflow.com/questions/4720271/find-a-pair-of-elements-from-an-array-whose-sum-equals-a-given-number
 */
public class FindAllPairsOfNumWithSum {

    static void findThePairs(int inputArray[], int inputNumber)
    {
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");

        for (int i = 0; i < inputArray.length; i++)
        {
            for (int j = i+1; j < inputArray.length; j++)
            {
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        findThePairs(new int[] {4, 5, 7, 11, 9, 13, 8, 12}, 20);
        findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);

        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
    }
}
