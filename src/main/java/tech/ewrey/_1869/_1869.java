package tech.ewrey._1869;

import java.util.LinkedList;
import java.util.Queue;

public class _1869 {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("110100010"));
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
    }

    public static boolean checkZeroOnes(String s) {
        Queue<Integer> q_1 = new LinkedList<>();
        Queue<Integer> q_0 = new LinkedList<>();
        int max_0 = 0;
        int max_1 = 0;
        for (var a : s.toCharArray()) {
            if (a == '1') {
                if (!q_0.isEmpty()) {
                    max_0 = Math.max(max_0, q_0.size());
                    q_0.clear();
                }
                q_1.add(1);
            } else {
                if (!q_1.isEmpty()) {
                    max_1 = Math.max(max_1, q_1.size());
                    q_1.clear();
                }
                q_0.add(0);
            }
        }
        max_0 = Math.max(max_0, q_0.size());
        max_1 = Math.max(max_1, q_1.size());
        System.out.println(max_1);
        System.out.println(max_0);
        return max_1 > max_0;
    }

}
