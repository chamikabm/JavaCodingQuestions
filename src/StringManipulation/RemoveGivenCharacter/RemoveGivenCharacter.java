package StringManipulation.RemoveGivenCharacter;

public class RemoveGivenCharacter {
    public static void main(String[] args) {

        System.out.println("abcde".substring(1,3));
        String str = "chamika";
        char c = 'a';
        System.out.println(removeCharacter(str, c));
        System.out.println(removeCharacter2(str, c));
    }

    private static String removeCharacter(String str, char c) {
        return str.replace(c, ' ').replaceAll(" ", "");
    }

    // This only removes the first character.
    private static String removeCharacter2(String str, char c) {
        int index = str.indexOf(String.valueOf(c));
        return str.substring(0, index) + str.substring(index + 1);
    }


}
