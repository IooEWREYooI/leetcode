package tech.ewrey._2465;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class _2465 {

    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[]{4,1,4,0,3,5}));
    }

    public static int distinctAverages(int[] nums) {
        Queue<Integer> maxes = new PriorityQueue<>();
        Queue<Integer> mins = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums) {
            maxes.add(i);
            mins.add(i);
        }
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < nums.length / 2; i++) {
            set.add((maxes.poll().doubleValue() + mins.poll().doubleValue()) / 2);
        }
        return set.size();
    }

}
