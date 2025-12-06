package tech.ewrey._2231;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _2231 {

    public static void main(String[] args) {
//        System.out.println(largestInteger(12345));
        System.out.println(largestInteger(65875));
//        System.out.println(largestInteger(27488));
        System.out.println(largestInteger(1234));
    }

    /*
        Нам нужно вернуть максимальное число с возможными переставновками четных и нечетныч чисел
        1234 -> 1 меняем на 3, 2 меняем на 4 -> 3412

        Менять стоит до тех пор, пока для каждой позиции впереди стоят только элемент меньше чем они или равны
        Для позиции 0 может стоять или 1 или 3, меняем местами
     */
    public static int largestInteger(int num) {
        PriorityQueue<Integer> odd = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Comparator.reverseOrder());

        int[] arr = String.valueOf(num).chars().map(x -> x - '0').toArray();
        boolean[] tmp = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            tmp[i] = arr[i] % 2 == 0;
            if (j % 2 == 0) odd.add(j);
            else even.add(j);
        }
        StringBuilder sb = new StringBuilder();
        for (boolean b : tmp) {
            if (tmp.length % 2 == 0) {
                sb.append(b ? odd.poll() : even.poll());
            } else {
                sb.append(b ? odd.isEmpty() ? even.poll() : odd.poll() : even.isEmpty() ? odd.poll() : even.poll());
            }
        }

        return Integer.parseInt(sb.toString());
    }

}
