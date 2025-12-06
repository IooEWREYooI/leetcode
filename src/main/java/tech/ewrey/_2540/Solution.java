package tech.ewrey._2540;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
        System.out.println(getCommon(new int[]{1,1,2}, new int[]{2,4}));
        System.out.println(getCommon(new int[]{1,2,8,12,32,34,43,52,57,62,64,67,71,71,79,81,86,91,93,94},
                new int[]{9,11,12,14,19,25,29,31,38,39,41,42,58,63,66,70,71,73,91,91}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(TreeSet::new));
        Set<Integer> set2 = new TreeSet<>();
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }
        return set2.stream().findFirst().orElse(-1);

    }
}
