package tech.ewrey._3046;

import tech.ewrey.util.Array;

import java.util.HashMap;
import java.util.Map;

public class _3046 {

    public static void main(String[] args) {
        System.out.println(isPossibleToSplit(Array.of(1,1,2,2,3,4)));
        System.out.println(isPossibleToSplit(Array.of(1,1,1,1)));
    }

    public static boolean isPossibleToSplit(Integer[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            int freq = map.getOrDefault(a, 0) + 1;
            if (freq > 2) return false;
            map.put(a, freq);
        }
        return true;
    }

}
