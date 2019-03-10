package Knowledge.Test;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClass  extends SimpleClass {

    public static void main(String[] args) {

//
//        Scanner sc = new Scanner(System.in);
//
//        int in = sc.nextInt();
//
//        solution(in);

        System.out.println(solution(123456));

    }

    @Override
    public void simpleMethod() throws NumberFormatException {
        System.out.println("complex");
    }

    public static void test() throws IllegalArgumentException, StackOverflowError {
        System.out.println("complex");
    }

    private static int solution2(int A) {
        int length = String.valueOf(A).length();
        int[] digits = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            digits[i] = A % 10;
            A = A / 10;
        }

        int answer = 0;
        for (int i = 0; i < length / 2; i++) {
            answer += digits[i];
            answer *= 10;
            answer += digits[length - i - 1];
            answer *= 10;
        }

        if (length % 2 == 1) {
            answer += digits[length/2];
        } else {
            answer /= 10;
        }
        System.out.println(answer);

//
//        String a = String.valueOf(A);
//        int length = a.length()/2 + 1;
//        System.out.println(length);
//
//        String collect = IntStream.range(0, 2)
//                .mapToObj(operand -> a.charAt(operand) + "" + a.charAt(a.length() - operand -1))
//                .collect(Collectors.joining(""));
//
//        System.out.println(collect);

        return answer;
    }

    private static int solution(int A) {

        return Integer.parseInt(shuffle(String.valueOf(A)));
    }

    public static String shuffle(String s){
        if(s.length() < 2){
            return s;
        }

        return Character.toString(s.charAt(0))+Character.toString(s.charAt(s.length()-1)) + shuffle(s.substring(1,s.length()-1));
    }
}
