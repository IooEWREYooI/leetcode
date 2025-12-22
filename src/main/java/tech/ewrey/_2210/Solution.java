package tech.ewrey._2210;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(countHillValley(2,4,1,2,1,2,6,5));
//        System.out.println(countHillValley(6,6,5,5,4,1));
//        System.out.println(countHillValley(2,4,1,2,1,2,6,5));
        System.out.println(countHillValley(2,4,1,1,6,5));
    }

    public static int countHillValley(int... nums) {
        List<Integer> set = new ArrayList<>();
        for (int i = 0, k = i + 1; i < nums.length; i++, k++) {
            if (k < nums.length) {
                if (nums[i] != nums[k]) {
                    set.add(nums[i]);
                }
            } else if (nums[i] != nums[i - 1]) set.add(nums[i]);
        }
        Integer[] arr = set.toArray(new Integer[]{});
        int res = 0;
        System.out.println(set);
        for (int i = 1, l = 0, r = i + 1; r < arr.length; i++, r++, l++) {
            if ((arr[i] > arr[l] && arr[i] > arr[r]) || (arr[i] < arr[l] && arr[i] < arr[r])) {
                res++;
            }
        }
        return res;
    }
}