package tech.ewrey._27;

public class Solution {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
//        System.out.println(strStr("sadbutsad", "sad"));
//        System.out.println(strStr("leetcode", "leeto"));
//        System.out.println(strStr("mississippi", "issip"));
//        System.out.println(strStr("bbbbababbbaabbba", "abb"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() >= needle.length()) {
            for (int i = 0; i < haystack.length(); i ++) {
                if (needle.length() + i > haystack.length()) {
                    break;
                }
                String tmp = haystack.substring(i, needle.length() + i);
                if (tmp.equals(needle)) {
                    return i;
                }
            }

        }
        return -1;
    }

}
