package tech.ewrey._28;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        int[] a = new int[]{3,2,2,3};
        System.out.println(removeElement(a, 3));
        System.out.println(Arrays.toString(a));
    }

    public static int removeElement(int[] nums, int val) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                r++;
                nums[i] = -1;
            }
        }
        Integer[] arr = new Integer[nums.length];
        for (int i = 0, k = -1; i < nums.length; i++) if (nums[i] >= 0) arr[++k] = nums[i];
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] != null) {
                nums[i] = arr[i];
            } else {
                nums[i] = -1;
            }
        }
        return nums.length - r;
    }
}
