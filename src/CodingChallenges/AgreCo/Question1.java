package CodingChallenges.AgreCo;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(solution("ASDS"));
    }

    public static String solution(String s) {
        if(s.equals("")) {
            return "other";
        }
        char c = s.charAt(0);
        int a = (int)c;
        if (a >= 65 && a <= 90 ) {
            return "upper";
        } else if (a >= 97 && a <= 122) {
            return "lower";
        } else if (a >= 48 && a <= 57) {
            return "digit";
        } else {
            return "other";
        }
    }
}
