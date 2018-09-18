package Symbols.ParenthesisMatch;

import java.util.Stack;

public class ParenthesisMatch {
    public static void main(String[] args) {
        String parenthesisString = "(())";
        System.out.println(isParenthesisMatch(parenthesisString));

    }

    private static boolean isParenthesisMatch(String parenthesisString) {
        Stack stack = new Stack();
        if (parenthesisString == null || parenthesisString.isEmpty()) {
            return false;
        }

        for (int i = 0; i < parenthesisString.length(); i++) {
            if(isOpeningTag(String.valueOf(parenthesisString.charAt(i)))){
                stack.push(String.valueOf(parenthesisString.charAt(i)));
            } else if (isClosingTag(String.valueOf(parenthesisString.charAt(i)))){
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningTag(String tag) {
        return tag.equals("(") || tag.equals("{") || tag.equals("[");
    }

    private static boolean isClosingTag(String tag) {
        return tag.equals(")") || tag.equals("}") || tag.equals("]");
    }
}
