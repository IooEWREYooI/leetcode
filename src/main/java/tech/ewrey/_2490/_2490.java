package tech.ewrey._2490;

import java.util.HashMap;

public class _2490 {

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("Leetcode eisc cool"));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] split = sentence.split(" ");
        if (split.length == 1) return split[0].charAt(0) == split[0].charAt(split[0].length() - 1);
        for (int i = 0, k = 1; i < split.length; i++, k++) {
            if (k == split.length) k = 0;
            if (split[i].charAt(split[i].length() - 1) != split[k].charAt(0)) {
                return false;
            }
        }
        return true;
    }

}
