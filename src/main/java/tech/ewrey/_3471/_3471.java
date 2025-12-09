package tech.ewrey._3471;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class _3471 {

    public static void main(String[] args) {
        System.out.println(largestInteger(new int[]{3,9,2,1,7}, 4));
        System.out.println(largestInteger(new int[]{0,0}, 2));
    }

    public static int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        Set<Integer> set = new HashSet<>(k);
        for (int i = 0, j = k - 1; i < nums.length; i++, j++, set.clear()) {
            if (j == nums.length) break;
            for (int m = i; m <= j; m++) {
                set.add(nums[m]);
            }
            for (int a : set) map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int max = -1;
        for (var kv : map.entrySet()) {
            if (kv.getValue() == 1) max = Math.max(max, kv.getKey());
        }

        return max;
    }


}
