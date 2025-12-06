package tech.ewrey._3;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class _3 {

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring_version_in_comment("pwwkew"));
    }

    public static int lengthOfLongestSubstring_version_in_comment(String s) {
        int res = 0;
        Deque<Character> q = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (q.contains(c)) while (q.pollFirst() != c);
            q.add(c);
            res = Math.max(res, q.size());
        }
        return res;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        for (int i = s.length(); i > 1; i--) {
            for (int k = 0; i + k <= s.length(); k++) {
                Map<Character, Integer> map = new HashMap<>();
                char[] arr = s.substring(k, i + k).toCharArray();
                boolean isBreak = false;
                for (char a : arr) {
                    if (map.put(a, 0) != null) {
                        isBreak = true;
                        break;
                    }
                }
                if (isBreak) {
                    if (s.length() > 950) break;
                    continue;
                }
                if (arr.length == map.size()) return arr.length;
            }
        }
        return 1;
    }

}
