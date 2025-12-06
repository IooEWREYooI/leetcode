package tech.ewrey._1089;

import tech.ewrey.util.Array;

import java.util.Arrays;

public class Solution {

    /*
        Итерируемся по массиву, если элемент arr[i] == 0, то необходимо сделать сдвиг всех элементов > i вправо на один

        Сдвиг:
            Итерируемся с конца, берем указатель k = arr.len
            arr[k] = arr[k - 1]
            k --;
     */

    public static void main(String[] args) {
        var i = new int[]{1,0,2,3,0,4,5,0};
        var ii = new int[]{0,0,2,3,0,4,5,0};
        duplicateZeros(ii);
        System.out.println(Arrays.toString(ii));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                rightSwap(arr, i);
                arr[i] = 0;
                i++;
            }
        }
    }

    private static void rightSwap(int[] arr, int i) {
        for (int len = arr.length - 1; len >= i; len--) {
            if (len - 1 < 0) continue;
            arr[len] = arr[len - 1];
        }
    }

}
