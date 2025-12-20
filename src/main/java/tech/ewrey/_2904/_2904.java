package tech.ewrey._2904;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _2904 {

    public static void main(String[] args) {
        System.out.println(shortestBeautifulSubstring("100011001", 3));
        System.out.println(shortestBeautifulSubstring("11000111", 1));
    }

    public static String shortestBeautifulSubstring(String s, int k) {
        int f = k;
        Queue<String> q = new PriorityQueue<>((x, y) ->
                x.length() == y.length() ?
                Integer.compare(Integer.parseInt(y), Integer.parseInt(x)) : Integer.compare(x.length(), y.length()));
        for (int i = 0; k < s.length(); i++) {
            if (k + i > s.length() || i == s.length()) {
                i = 0;
                k++;
            }
            var string = s.substring(i, k + i);
            if (isBeautiful(string, f)) q.add(string);
        }
        if (!q.isEmpty()) {
            return q.poll();
        }
        return "";
    }

    private static boolean isBeautiful(String s, int k) {
        int res = 0;
        for (char a : s.toCharArray()) if (a == '1') res++;
        return res == k;
    }

}
