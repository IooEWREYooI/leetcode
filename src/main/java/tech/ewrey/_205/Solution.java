package tech.ewrey._205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("agggg", "dffff"));
        System.out.println(isIsomorphic("abcdefghijklmnopqrstuvwxyzva", "abcdefghijklmnopqrstuvwxyzck"));
        // 011 011
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        int sPoint = 0;
        int tPoint = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), sPoint++);
            }
            if (!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tPoint++);
            }
        }

        if (sPoint != tPoint) {
            return false;
        }

        List<Integer> sEncode = new ArrayList<>();
        List<Integer> tEncode = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            sEncode.add(sMap.get(s.charAt(i)));
            tEncode.add(tMap.get(t.charAt(i)));
        }

        return Arrays.equals(sEncode.toArray(), tEncode.toArray());
    }

}
