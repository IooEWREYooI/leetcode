package tech.ewrey._3005;

import java.util.HashMap;
import java.util.Map;

public class _3005 {

    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
        System.out.println(maxFrequencyElements(new int[]{1,2,3,4,5}));
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int freq;
        for (int num : nums) {
            freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
            maxFreq = Math.max(freq, maxFreq);
        }
        int sum = 0;
        for (var kv : map.entrySet()) if (kv.getValue() == maxFreq) sum += kv.getValue();
        return sum;
    }

}
