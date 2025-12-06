package tech.ewrey._3074;

import tech.ewrey.util.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        System.out.println(minimumBoxes(Array.of(1,3,2), Array.of(4,3,1,5,2)));
    }

    /*
        Сортируем capacity от большего к меньшему, priorityQueue

        Берем переменную res, берем наибольший из queue через pop, чтобы удалить из очереди
        res += queue.pop

        если res >= apple.len return apple.len - queue.size

     */
    public static int minimumBoxes(Integer[] apple, Integer[] capacity) {
        int sumApple = 0;

        for (int a : apple) {
            sumApple += a;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int a : capacity) {
            queue.offer(a);
        }

        int res = 0;
        while (!queue.isEmpty()) {
            res += queue.poll();
            if (res >= sumApple) {
                return capacity.length - queue.size();
            }
        }

        return 0;
    }

}
