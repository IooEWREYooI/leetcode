package tech.ewrey._1800;

public class _1800 {

    public static void main(String[] args) {
        System.out.println(maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
        System.out.println(maxAscendingSum(new int[]{10, 20, 30, 40, 50}));
        System.out.println(maxAscendingSum(new int[]{10,20,30,5,10,50}));
        System.out.println(maxAscendingSum(new int[]{100,10,1}));
    }

    /*
        Итерируемся по массиву с 2-мя указателями, i и i + 1 = j
            Если arr[i] < arr[j] то в tmp += arr[i] + arr[j]
            Иначе max = Math.max(tmp, max) i++

            return max
     */
    public static int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int tmp = 0;
        for (int i = 0, j = 1; i < nums.length; i++, j++) {
            if (j >= nums.length) {
                max = Math.max(max, tmp);
                break;
            }

            if (nums[i] < nums[j]) {
                tmp += tmp == 0 ? nums[i] + nums[j] : nums[j];
            } else {
                max = Math.max(max, tmp);
                tmp = 0;
            }
        }
        return max;
    }

}
