package tech.ewrey._3456;

import java.util.HashSet;
import java.util.Set;

public class _3456 {

    public static void main(String[] args) {
        System.out.println(hasSpecialSubstring("aaabaaa", 3));
        System.out.println(hasSpecialSubstring("abc", 2));
        System.out.println(hasSpecialSubstring("jkjhfgg", 2));
    }

    public static boolean hasSpecialSubstring(String s, int k) {
        if (s.length() == 1) return k == 1;
        for (int i = 0, j = k; i < s.length(); i++, j++) {
            if (j > s.length()) break;
            String subString = s.substring(i, j);
            Character tmp = null;
            boolean uniquesInSubString = true;
            for (char a : subString.toCharArray()) {
                if (tmp == null) tmp = a;
                else if (a != tmp) uniquesInSubString = false;
            }
            if (uniquesInSubString && (i - 1 < 0 || s.charAt(i - 1) != tmp)
                    && (j > s.length() - 1 || s.charAt(j) != tmp)) {
                return true;
            }
        }
        return false;
    }

}
