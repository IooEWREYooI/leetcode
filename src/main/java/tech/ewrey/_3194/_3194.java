package tech.ewrey._3194;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class _3194 {

    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
    }

    public static double minimumAverage(int[] nums) {
        Queue<Integer> maxes = new PriorityQueue<>();
        Queue<Integer> mins = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) {
            maxes.add(i);
            mins.add(i);
        }
        TreeSet<Double> set = new TreeSet<>();
        for (int i = 0; i < nums.length / 2; i++) {
            set.add((maxes.poll().doubleValue() + mins.poll().doubleValue()) / 2);
        }
        return set.first();
    }

}
