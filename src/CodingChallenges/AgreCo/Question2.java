package CodingChallenges.AgreCo;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    private static int solution(int A) {

        return Integer.parseInt(shuffle(String.valueOf(A)));
    }

    private static String shuffle(String s){
        if(s.length() < 2){
            return s;
        }

        return Character.toString(s.charAt(0))
                + Character.toString(s.charAt(s.length()-1)) + shuffle(s.substring(1,s.length()-1));
    }
}
