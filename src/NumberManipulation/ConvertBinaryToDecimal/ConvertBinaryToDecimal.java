package NumberManipulation.ConvertBinaryToDecimal;

/**
 * Program: Write a program to convert binary to decimal number.
 *
 * Link : http://www.java2novice.com/java-interview-programs/binary-to-decimal/
 *
 * Description:
 *
 * Write a program to convert binary format to decimal number using numeric operations.
 * Below example shows how to convert binary to decimal format using numeric operations.
 *
 *
 */
public class ConvertBinaryToDecimal {

    public static void main(String[] args) {
        ConvertBinaryToDecimal bd = new ConvertBinaryToDecimal();
        System.out.println("11 ===> "+bd.getDecimalFromBinary(11));
        System.out.println("110 ===> "+bd.getDecimalFromBinary(110));
        System.out.println("100110 ===> "+bd.getDecimalFromBinary(100110));
    }

    public int getDecimalFromBinary(int binary){

        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }
}
