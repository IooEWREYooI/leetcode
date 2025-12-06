package tech.ewrey._268;

public class Solution {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{1}));
    }

    public static int missingNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }

            if (min > num) {
                min = num;
            }
        }

        boolean contains = false;
        for (int local_max = max - 1; local_max > 0; local_max--) {
            for (int num : nums) {
                if (num == local_max) {
                    contains = true;
                    break;
                }
            }
            if (!contains) return local_max;
        }
        return min == 0 ? ++max : 0;
    }
}
