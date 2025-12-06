package tech.ewrey._283;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        extracted(new int[]{0,1,0,3,12});
//        extracted(new int[]{0,1});
//        extracted(new int[]{2,1});
    }

    private static void extracted(int[] i) {
        System.out.println("\nin: " + Arrays.toString(i));
        moveZeroes(i);
        System.out.println("out: " + Arrays.toString(i));
    }

    /*
        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]


        берем число из nums [0, 1]
            если число == 0,
                меняю с конечным в массиве, если последний эелемент == 0, то с последним что не равен 0
     */

    public static void moveZeroes_v0(int[] nums) {
        if (nums.length == 1) return;
        int i = 0, k = 0, n = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            } else {
                n++;
            }
        }
        if (n > 0) {
            for (int j = nums.length - 1; nums.length > 2 ? j > n : j >= n; j--) {
                nums[j] = 0;
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0, k = 0, l = nums.length - 1; i < nums.length; i++, l--) {
            if (nums[i] != 0) {
                temp[k] = nums[i];
                k++;
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

}
