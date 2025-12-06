package tech.ewrey._28;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int r = 0;
        int[] rArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                r++;
            } else {
                rArr[i] = nums[i];
            }
        }
        nums = rArr;
        return nums.length - r;
    }
}
