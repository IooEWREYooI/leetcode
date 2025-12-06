package tech.ewrey._3114;

import java.util.Arrays;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(findLatestTime("1?:?4"));
//        System.out.println(findLatestTime("?3:12"));
        System.out.println(findLatestTime("03:?2"));
    }

    /*
        Берем строку 1?:?4 ее приравниваем к массиву [1,?,?,4]
        Для каждого символа ? идем в map и берем оттуда максимальную цифру
        map.get(1) -> 2
        map.get(2) -> 5
        [1,?,?,4] -> [1,9,5,4], такое время не валидно, стоило бы понять как сделать его валидным
        19 > 12, если так то уменьшаем [1] до тех пор, пока не будет x < 1200
     */
    public static String findLatestTime(String s) {
        char[] arr = s.replaceAll(":", "").toCharArray();
        int[] m = new int[4];
        int[] n = new int[4];
        for (int i = 0; i < arr.length; i++) {
            m[i] = arr[i] - '0';
            if (m[i] == '?' - '0') n[i] = -1;
        }
//        int half1 = Integer.parseInt(String.valueOf(arr[0]) + arr[1]);
//        int half2 = Integer.parseInt(String.valueOf(arr[2]) + arr[3]);
//        if (half2 == 0) half1 = 12;
//        else while (half1 > 11) half1--;
//        while (half2 > 59) half2--;
//        return (half1 >= 10 ? "" : "0") + half1 + ":" + half2;
        return null;
    }

    private static String makeValid(char[] arr) {
        int half1 = Integer.parseInt(String.valueOf(arr[0]) + arr[1]);
        int half2 = Integer.parseInt(String.valueOf(arr[2]) + arr[3]);
        if (half2 == 0) half1 = 12;
        else while (half1 > 11) half1--;
        while (half2 > 59) half2--;
        return half1 + ":" + half2;
    }
}
