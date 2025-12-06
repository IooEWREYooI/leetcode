package tech.ewrey._53;

//Given an integer array nums, find the subarray with the largest sum, and
//return its sum.
//
//
// Example 1:
//
//
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//
//
// Example 2:
//
//
//Input: nums = [1]
//Output: 1
//Explanation: The subarray [1] has the largest sum 1.
//
//
// Example 3:
//
//
//Input: nums = [5,4,-1,7,8]
//Output: 23
//Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁵
// -10⁴ <= nums[i] <= 10⁴
//
//
//
// Follow up: If you have figured out the O(n) solution, try coding another
//solution using the divide and conquer approach, which is more subtle.
//
// Related Topics Array Divide and Conquer Dynamic Programming 👍 36634 👎 1557


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{-2,1})); // 1
    }

    public static int maxSubArray(int[] nums) {
        int maxCurrent = nums[0]; // Первый указатель на локальный мах по итерации
        int maxGlobal = nums[0]; // Второй указатель на общий мах

        for (int i = 1; i < nums.length; i++) {
            // Линейный проход по всем значениям массива
            // Вычисление локального максимума по логике
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        return maxGlobal;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

