package tech.ewrey._2210;

public class Solution {

    public static void main(String[] args) {
        countHillValley(2,4,1,1,6,5);
//        System.out.println(countHillValley(6,6,5,5,4,1));
    }

    public static int countHillValley(int... nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                System.out.println("холм: " + nums[i]);
            } else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                System.out.println("долина: " + nums[i]);
            }
        }
        return 0;
    }
}