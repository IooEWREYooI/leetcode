package tech.ewrey._1996;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfWeakCharacters(
                new int[][]{
                        new int[]{5,5}, new int[]{6,3}, new int[]{3,6}
                }
        ));
        System.out.println(numberOfWeakCharacters(
                new int[][]{
                        new int[]{1,5}, new int[]{10,4}, new int[]{4,3}
                }
        ));
    }


    /*
        Создаем мапу:
            {5 : [5,0], [3,1]}
            т.е первое число массива внутреннего как ключ, и значение это второе число + индекс

            Далее для каждого элемента делаем map.get(arr[0]) по списку массива проходимся всему и если:
                arr[1] == map.get.arr[0] то map.get.arr[1] (индекс), добавляем в set

            Возвращаем set.size
     */
    public static int numberOfWeakCharacters(int[][] properties) {
        int count = 0;
        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);

        int max = 0;
        for (int[] property : properties) {
            if (property[1] < max) {
                count++;
            }
            max = Math.max(max, property[1]);
        }
        return count;
    }

}
