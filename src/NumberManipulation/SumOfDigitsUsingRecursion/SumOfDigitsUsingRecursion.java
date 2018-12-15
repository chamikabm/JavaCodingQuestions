package NumberManipulation.SumOfDigitsUsingRecursion;

/**
 * Program: Write a program to find sum of each digit in the given number using recursion.
 *
 * Link : http://www.java2novice.com/java-interview-programs/number-sum-recursive/
 *
 * Description:
 *
 * Below example shows how to find out sum of each digit in the given number using recursion logic.
 * For example, if the number is 259, then the sum should be 2+5+9 = 16.
 *
 */
public class SumOfDigitsUsingRecursion {
    int sum = 0;

    public int getNumberSum(int number){

        if(number == 0){
            return sum;
        } else {
            sum += (number%10);
            getNumberSum(number/10);
        }
        return sum;
    }

    public static void main(String a[]){
        SumOfDigitsUsingRecursion mns = new SumOfDigitsUsingRecursion();
        System.out.println("Sum is: "+mns.getNumberSum(223));
    }
}
