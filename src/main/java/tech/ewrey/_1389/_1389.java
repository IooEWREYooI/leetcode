package tech.ewrey._1389;

import java.util.Arrays;
import java.util.LinkedList;

public class _1389 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
    }

    /*
        Создаем связный список
        из index, берем индекс куда надо вставить nums[index] в связный список
        nums = [0,1,2,3,4], index = [0,1,2,2,1]
        итерируемся по index
            curr = index[i]
            value = nums[curr]
            list.add(curr, value) на позицию curr вставь value
     */
    public static int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            list.add(index[i], value);
        }
        int[] res = new int[list.size()];
        int i = 0;
        for (int a : list) {
            res[i] = a;
            i++;
        }
        return res;
    }

}
