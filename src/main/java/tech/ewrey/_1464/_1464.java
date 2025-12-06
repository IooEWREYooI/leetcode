package tech.ewrey._1464;

public class _1464 {

    public static void main(String[] args) {
//        System.out.println(maxProduct(new int[]{3,4,5,2}));
        System.out.println(maxProduct(new int[]{1,5,4,5}));
    }

    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
            }
        }
        return max;
    }

}
