package tech.ewrey._506;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(5, 4, 3, 2, 1)));
        System.out.println(Arrays.toString(findRelativeRanks(10, 3, 8, 9, 4)));
        System.out.println(Arrays.toString(findRelativeRanks(100,111,111111)));
    }

    public static String[] findRelativeRanks(int... score) {
        Map<Integer, String> map = new TreeMap<>();
        for (int i : score) {
            map.put(i, i + "");
        }
        int k = map.size();
        for (var i : map.keySet()) {
            map.put(i, k-- + "");
        }
        String[] arr = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            String val = map.get(score[i]);
            switch (val) {
                case "1" -> arr[i] = "Gold Medal";
                case "2" -> arr[i] = "Silver Medal";
                case "3" -> arr[i] = "Bronze Medal";
                default -> arr[i] = val;
            }
        }
        return arr;
    }
}
