package tech.ewrey._3452;

public class _3452 {

    public static void main(String[] args) {
        System.out.println(sumOfGoodNumbers(new int[]{17,33,26}, 1));
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            boolean fExist = false;
            boolean sExist = false;
            if (i - k >= 0 && i - k < nums.length) fExist = true;
            if (i + k >= 0 && i + k < nums.length) sExist = true;
            if (!fExist && !sExist) {
                sum += num;
            } else if (sExist && !fExist){
                int s = nums[i + k];
                if (num > s) sum += num;
            } else if (fExist && !sExist) {
                int f = nums[i - k];
                if (num > f) sum += num;
            } else if (sExist && fExist) {
                int f = nums[i - k];
                int s = nums[i + k];
                if (num > f && num > s) sum += num;
            }
        }
        return sum;
    }

}
