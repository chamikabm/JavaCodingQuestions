package StringManipulation.CheckStringContainsString;

public class CheckStringContainsString {

    public static void main(String[] args) {
        String firstString = "This has been awesome";
        String secondString = "been";

        System.out.println(checkStringContainsSubString(firstString, secondString));
    }

    private static boolean checkStringContainsSubString(String firstString, String secondString) {
        if (secondString.length() > firstString.length()) {
            return false;
        }

        boolean hasString = false;
        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) == secondString.charAt(0)) {
                for (int j = 0; j < secondString.length(); j++) {
                    if (secondString.charAt(j) == firstString.charAt(i+j)) {
                        hasString = true;
                    } else {
                        hasString = false;
                    }
                }
            }
        }


        return hasString;
    }
}
