package tech.ewrey._2185;

import tech.ewrey.util.Array;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(prefixCount(Array.of("pay","attention","practice","attend"), "at"));
    }

    public static int prefixCount(String[] words, String pref) {
        int sum = 0;
        for (String a : words) {
            if (a.startsWith(pref)) sum++;
        }
        return sum;
    }

}
