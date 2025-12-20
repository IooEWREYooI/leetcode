package tech.ewrey._944;

import tech.ewrey.util.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class _944 {

    public static void main(String[] args) {
        System.out.println(minDeletionSize(Array.of("abc", "bce", "cae")));
    }

    public static int minDeletionSize(String[] strs) {
        char[][] arrs = new char[strs.length][];
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            arrs[i] = strs[i].toCharArray();
            max = Math.max(arrs[i].length, max);
        }
        List<Character> list = new LinkedList<>();
        int res = 0;
        for (int i = 0, m = 0; i < max; m++) {
            if (m >= arrs.length) {
                m = 0;
                i++;
                int tmp = 0;
                for (var a : list ) {
                    if (tmp > (int) a) {
                        res++;
                        break;
                    } else tmp = (int) a;
                }
                list.clear();
            }
            if (i < max) {
//                System.out.println("m i = " + arrs[m][i]);
                list.add(arrs[m][i]);
            }
        }
        return res;
    }

}
