package NumberManipulation.SwapNumbers.SwapNumbersWithoutTemp;

/**
 * Program: How to swap two numbers without using temporary variable?
 *
 * Link : http://www.java2novice.com/java-interview-programs/swap-two-numbers/
 *
 * Description:
 *
 * Write a program to swap or exchange two numbers. You should
 * not use any temporary or third variable to swap.
 *
 */
public class SwapNumbersWIthoutTemp {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        x = x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
    }
}
