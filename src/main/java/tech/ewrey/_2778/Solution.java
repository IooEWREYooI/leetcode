package tech.ewrey._2778;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().sumOfSquares(1,2,3,4));
        System.out.println(new Solution().sumOfSquares(2,7,1,19,18,3));
    }

    public int sumOfSquares(int... nums) {
        int res = 0;
        for (int i = 0, tmp; i < nums.length; i++) {
            if (nums.length % (i + 1) == 0) {
                tmp = nums[i] * nums[i];
                res += tmp;
            }
        }
        return res;
    }

}