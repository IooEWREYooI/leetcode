package tech.ewrey._3065;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _3065 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2, 11, 10, 1, 3}, 10));
        System.out.println(minOperations(new int[]{1, 1, 2, 4, 9}, 1));
        System.out.println(minOperations(new int[]{1, 1, 2, 4, 9}, 9));
    }

    public static int minOperations(int[] nums, int k) {
        int j = 0;
        for (int i : nums) {
            if (i < k) j++;
        }

        return j;
    }

    public int minOperationsV_1(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (var i : nums) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            if (queue.poll() >= k) return nums.length - queue.size() - 1;
        }

        return -1;
    }

}
