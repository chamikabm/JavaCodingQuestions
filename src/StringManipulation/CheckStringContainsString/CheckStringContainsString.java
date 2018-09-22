package StringManipulation.CheckStringContainsString;

public class CheckStringContainsString {

    public static void main(String[] args) {
        String firstString = "This has been awesome";
        String secondString = "has";

        System.out.println(checkStringContainsSubString(firstString, secondString));
        System.out.println(checkStringContainsSubString2(firstString, secondString));
        System.out.println(checkStringContainsSubString3(firstString, secondString));
    }

    private static boolean checkStringContainsSubString(String s1, String s2) {
        String firstString = s1.replaceAll(" ", "");
        String secondString = s2.replaceAll(" ", "");
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

    private static boolean checkStringContainsSubString2(String firstString, String secondString) {
        StringBuilder sb = new StringBuilder(firstString.replaceAll(" ",""));

        return sb.indexOf(secondString.replaceAll(" ","")) != -1;
    }

    private static boolean checkStringContainsSubString3(String firstString, String secondString) {
        return firstString.replaceAll(" ","").contains(secondString.replaceAll(" ",""));
    }
}
