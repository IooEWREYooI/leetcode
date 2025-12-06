package tech.ewrey._2224;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertTime("02:30", "04:35"));
//        System.out.println(convertTime("11:00", "04:35"));
//        System.out.println(convertTime("04:35", "04:35"));
    }

    /*
        Есть время текущее и ожидаемое [60, 15, 5, 1]
        02:30 - 04:35
        Прибавляем к текущему времени 60 мин до тех пор, пока добавление 60 не выходит за диапазон ожидаемого
        02:30 0 +60
        03:30 1 +60
        04:30 2 +60
        05:40 - это много, к предыдущему +15
        04:45 - это много к предыдущему +5
        04:35 +5 найдено, возврат 3
        Как только вышло, берем след возможное прибавление
        Заканчиваем когда время найдено
     */

    /*
        [0,2,3,0] + [0,0,6,0]
        [0,2,9,0] -> [0,3,3,0]
        [0,3,3,0] == [0,4,3,0] false, continue
        [0,3,3,0] + [0,0,6,0]
        [0,3,9,0] -> [0,4,3,0]
        ...
     */
    public static int convertTime(String current, String correct) {
        if (current.equals(correct)) return 0;
        int[][] arr = new int[][]{new int[]{0,1,0,0}, new int[]{0,0,1,5}, new int[]{0,0,0,5}, new int[]{0,0,0,1}};
        int[] curr = current.chars().map(x -> x - 48).filter(x -> x != 10).toArray();
        int[] corr = correct.chars().map(x -> x - 48).filter(x -> x != 10).toArray();

        System.out.println(Arrays.toString(curr));


//        LocalDateTime ltCurr = LocalDateTime.parse("2007-12-03T%s:00".formatted(current));
//        LocalDateTime ltCorr = LocalDateTime.parse("2007-12-0%sT%s:00".formatted(LocalTime.parse(current).isBefore(LocalTime.parse(correct)) ? 3 : 4,correct));
        int i = 0;
        for (int k = -1; !arrEqual(curr, corr); k++) {
            int[] tmp = arrPlus(curr, arr[i]);
            if (arrEqual(curr, corr)) return k;
            else if (arrIsAfter(curr, corr) && i < arr.length - 1) i++;
            else curr = tmp;
            System.out.println(Arrays.toString(curr));
        }
        return 0;
    }

    static boolean arrIsAfter(int[] arr1, int[] arr2) {
        return arr1[0] > arr2[0] || arr1[1] > arr2[1] || arr1[2] > arr2[2] || arr1[3] > arr2[3];
    }

    static int[] arrPlus(int[] arr1, int[] arr2) {
        int[] tmp = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            tmp[i] = arr1[i] + arr2[i];
        }
        valid(tmp);
        return tmp;
    }

    static void valid(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

        }
    }

    static boolean arrEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}