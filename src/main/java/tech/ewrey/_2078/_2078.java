package tech.ewrey._2078;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class _2078 {

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{1,1,1,6,1,1,1}));
        System.out.println(maxDistance(new int[]{1,8,3,8,3}));
    }

    public static int maxDistance(int[] colors) {
        for (int i = 0, j = colors.length -1; i <= j; i++, j--) {
            if (colors[i] == colors[j]) i++;
            else System.out.println(colors[i] + " : " + colors[j]);
        }

        return 0;
    }

}
