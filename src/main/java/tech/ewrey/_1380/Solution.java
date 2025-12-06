package tech.ewrey._1380;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{
                // minInLine - l
                // maxInColumn - c
                {3,7,8},    // 00:l+:c-, 01:l-:c-, 02:l-:c-
                {9,11,13},  // 10;l+:c-, 11:l-:c-, 12:l-:c-
                {15,16,17}  // 20:l+:c+, 21:l-:c+, 22:l-:c+
                            // --------
        }));
        System.out.println(luckyNumbers(new int[][]{
                {1,10,4,2},     // 00,01
                {9,3,8,7},      // 10, 11
                {15,16,17,12}   // 20, 21
                // --------
        }));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minInLineList = new ArrayList<>(matrix.length);
        List<Integer> result = new ArrayList<>(matrix.length);

        for (int[] value : matrix) {
            int minInLine = Integer.MAX_VALUE;
            for (int num : value) {
                if (num < minInLine) minInLine = num;
            }
            minInLineList.add(minInLine);
        }

        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            int maxInColumn = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                if (ints[col] > maxInColumn) maxInColumn = ints[col];
            }
            if (minInLineList.contains(maxInColumn)) result.add(maxInColumn);
        }

        return result;
    }

}
