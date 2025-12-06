package tech.ewrey._2570;

import tech.ewrey.util.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _2570 {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mergeArrays(
                Array.of(Array.of(1, 2), Array.of(2, 3), Array.of(4, 5)),
                Array.of(Array.of(1, 4), Array.of(3, 2), Array.of(4, 1))
        )));
    }

    public static int[][] mergeArrays(Integer[][] nums1, Integer[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (Integer[] innerNums : nums1) {
            map.put(innerNums[0], innerNums[1]);
        }
        for (Integer[] innerNums : nums2) {
            map.put(innerNums[0], map.getOrDefault(innerNums[0], 0) + innerNums[1]);
        }
        int[][] res = new int[map.size()][];
        int i = 0;
        for (var kv : map.entrySet()) {
            res[i] = new int[]{kv.getKey(), kv.getValue()};
            i++;
        }
        return res;
    }

}
