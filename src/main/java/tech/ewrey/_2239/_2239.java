package tech.ewrey._2239;

import tech.ewrey.util.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class _2239 {

    public static void main(String[] args) {
        System.out.println(findClosestNumber(Array.of(-4,-2,1,4,8)));
        System.out.println(findClosestNumber(Array.of(-100000,-100000)));
        System.out.println(findClosestNumber(Array.of(2,-1,1)));
    }

    public static int findClosestNumber(Integer[] nums) {
        int minSoFar = nums[0];
        int actualValue = nums[0];
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(minSoFar)) {
                minSoFar = Math.abs(num);
                actualValue = num;
            }
            else if (Math.abs(num) == Math.abs(minSoFar)) {
                minSoFar = Math.max(minSoFar, num);
                actualValue = minSoFar;
            }
        }

        return actualValue;
    }

}
