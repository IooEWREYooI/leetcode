package tech.ewrey._1784;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
//        checkOnesSegment("101110111111011");
        System.out.println(checkOnesSegment("10011110111110"));
        System.out.println(checkOnesSegment("1"));
        System.out.println(checkOnesSegment("10"));
        System.out.println(checkOnesSegment("1100111"));
        System.out.println(checkOnesSegment("11"));
        System.out.println(checkOnesSegment("110"));
    }

    /*
        1001 -> 1,0,0,1
     */

    public static boolean checkOnesSegment(String s) {
        boolean has0 = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 48) has0 = true;
            else if (has0 && s.charAt(i) == 49) return false;
        } return true;
    }

}
