package StringManipulation.ReverseStringInPlace;

/**
 *
 * It's possible to reverse a String in place by using a StringBuilder. Since String is Immutable in Java,
 * it's not possible to reverse the same String, but you can minimize the number of intermediate
 * String objects by using StringBuilder or StringBuffer, which are mutable.
 * The algorithm to reverse the String in place is similar to the algorithm we have used earlier to reverse an
 * array in place. You need to traverse the String from one end, swapping characters at another
 * end until you reach the middle of the String. At the point characters in your String is reversed.
 * This algorithm only requires one extra character of memory to facilitate the swapping of characters.
 * The time complexity of this algorithm is O(n/2) i.e. O(n) where n is the length of String.
 *
 * Ideally, whenever you need to reverse a String in your application, you should be using the reverse()
 * method of StringBuilder. This method reverses the character sequence of the String in place.
 * It also handles the surrogate pairs correctly. If there are any surrogate pairs included in the sequence,
 * these are treated as single characters for the reverse operation.
 *
 *
 *
 * Read more: https://javarevisited.blogspot.com/2016/03/how-to-reverse-string-in-place-in-java.html#ixzz5aEkaka9V
 *
 * Link : https://javarevisited.blogspot.com/2016/03/how-to-reverse-string-in-place-in-java.html
 *
 */
public class ReverseStringInPlace {

    public static void main(String[] args) {

        String number = "1234";
        System.out.println("original String: " + number);
        String reversed = inPlaceReverse(number);
        System.out.println("reversed String: " + reversed);

    }

    private static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();

        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }

        return builder.toString();
    }
}
