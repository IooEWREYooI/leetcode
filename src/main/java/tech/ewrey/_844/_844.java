package tech.ewrey._844;

import java.util.Stack;

public class _844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for (int n = sArr.length - 1, i = 0; n >= 0; n--) {
            if (sArr[n] == '#') i++;
            else if (i == 0) sStack.add(sArr[n]);
            else i--;
        }
        for (int n = tArr.length - 1, i = 0; n >= 0; n--) {
            if (tArr[n] == '#') i++;
            else if (i == 0) tStack.add(tArr[n]);
            else i--;
        }
        System.out.println(sStack);
        System.out.println(tStack);
        return sStack.equals(tStack);
    }

}
