package tech.ewrey._1779;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _1779 {

    public static void main(String[] args) {
        System.out.println(nearestValidPoint(3, 4, new int[][]{new int[]{1,2}, new int[]{3,1}, new int[]{2,4}, new int[]{2,3}, new int[]{4,4}}));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        PriorityQueue<Integer[]> queue = new PriorityQueue<>(Comparator.comparingInt(xx -> xx[1]));
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                queue.add(new Integer[]{i, Math.abs(x - point[0]) + Math.abs(y - point[1])});
            }
        }
        return queue.isEmpty() ? -1 : queue.poll()[0];
    }

}
