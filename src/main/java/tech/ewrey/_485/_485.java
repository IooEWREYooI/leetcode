package tech.ewrey._485;

public class _485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, tmp = 0;
        for (var a : nums) {
            if (a == 1) tmp++;
            else tmp = 0;
            max = Math.max(tmp, max);
        }
        return max;
    }

}
