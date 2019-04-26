package CodingTests;

public class TwoByNBoardGameGrabTest {
    public static void main(String[] args) {
        TwoByNBoardGameGrabTest test = new TwoByNBoardGameGrabTest();
        int a[] = { 0, 0, 1, 1, 2};
        System.out.println(test.solution(2, 3, a));;
    }

    public String solution(int U, int L, int[] C) {
        // write your code in Java SE 8
        int cSize = C.length;
        if((cSize > (U + L)) || (cSize < (U + L))) {
            return "IMPOSSIBLE";
        }

        int upperTotal = U;
        int lowerTotal = L;
        String upper = "";
        String lower = "";

        //  0, 0, 1, 1, 2
        for (int i=0; i < C.length; i++) {
            System.out.println("Enter upperTotal :" + upperTotal);
            System.out.println("Enter lowerTotal :" + lowerTotal);
            System.out.println("C :" + C[i]);

            if(C[i] == 2) {
                System.out.println("in 2");
                upper += "1";
                lower += "1";
                upperTotal--;
                lowerTotal--;
            } else if (C[i] == 1) {
                System.out.println("in 1");
                if (upperTotal > 0) {
                    upper += "1";
                    lower += "0";
                    upperTotal--;
                } else if(lowerTotal > 0) {
                    lower += "1";
                    upper += "0";
                    lowerTotal--;
                } else {
                    return "IMPOSSIBLE";
                }
            } else {
                System.out.println("in 0");
                upper += "0";
                lower += "0";
            }

            System.out.println("upper :" + upper);
            System.out.println("lower :" + lower);
            System.out.println("Exit upperTotal :" + upperTotal);
            System.out.println("Exit lowerTotal :" + lowerTotal);
            System.out.println("");
        }

        return upper + "," + lower;
    }
}
