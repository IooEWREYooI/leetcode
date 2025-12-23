package tech.ewrey._561;

import java.util.PriorityQueue;
import java.util.Queue;

public class _561 {

    public static void main(String[] args) {
//        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
        System.out.println(arrayPairSum(new int[]{6,2,6,5,1,2}));
    }

    public static int arrayPairSum(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>();
        for (int a : nums) q.add(a);
        int sum = 0;
        while (!q.isEmpty()) {
            sum += Math.min(q.poll(), q.poll());
        }
        return sum;
    }

}
