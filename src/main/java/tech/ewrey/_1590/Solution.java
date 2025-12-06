package tech.ewrey._1590;

public class Solution {

    /*
        Дан массив положительных целых чисел nums. Удалите наименьший подмассив (возможно, пустой),
            такой что сумма оставшихся элементов делится на p. Удалять весь массив нельзя.
        Верните длину наименьшего подмассива, который нужно удалить, или -1 если это невозможно.

        Подмассив определяется как непрерывный блок элементов в массиве.

        Пример 1:
            Входные данные: nums = [3,1,4,2], p = 6
            Выходные данные: 1
            Пояснение: Сумма элементов в nums равна 10, что не делится на 6.
                Мы можем удалить подмассив [4], и сумма оставшихся элементов будет равна 6, что делится на 6.

        Пример 2:
            Входные данные: nums = [6,3,5,2], p = 9
            Выходные данные: 2
            Пояснение: Мы не можем удалить один элемент, чтобы получить сумму, кратную 9.
                Лучше всего удалить подмассив [5,2], оставив [6,3] с суммой 9.
        Пример 3:
            Входные данные: nums = [1, 2, 3], p = 3
            Выходные данные: 0
            Пояснение: Здесь сумма равна 6, что уже делится на 3. Таким образом, нам не нужно ничего удалять.
     */

    public static void main(String[] args) {
        System.out.println(minSubarray(new int[]{3,1,4,2}, 13));
//        System.out.println(minSubarray(new int[]{3,1,2}, 6));
    }

    public static int minSubarray(int[] nums, int p) {
        long sumArr = getSumArray(nums);
        if (sumArr % p == 0) {
            return 0;
        }

        /*
            Нужно создать subArray который способен хранить от 1 до nums.len - 1 элементов и выводить такое:
            if (getSumArray(nums) - getSumArray(sub)) % p == 0 return sub.len

            Сначала в sub кладем 1 элемент, сначала 0, затем 1 ... до тех пор пока не будет len-1 положенный
         */

        int k = 0;
        int len = 2;
        while (k <= nums.length - 1) {
            int[] sub = new int[len];
            for (int i = 0; i < sub.length; i++) {
                try {
                    sub[i] = nums[k + i];
                } catch (Exception e) {
                    System.out.println();
                }
            }
            if ((sumArr - getSumArray(sub)) % p == 0) return sub.length;
            k++;
        }

        return -1;
    }

    private static long getSumArray(int[] nums) {
        long sum = 0;
        for (int a : nums) {
            sum += a;
        }
        return sum;
    }


}
