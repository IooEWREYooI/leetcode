package tech.ewrey._2553;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _2553 {

    public static void main(String[] args) {
        System.out.println(separateDigits(new int[]{132}));
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
                .mapToObj(a -> String.valueOf(a).split(""))
                .flatMap(Arrays::stream)
                .map(Integer::parseInt)
                .toList();

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
