package tech.ewrey._2522;

public class _2522 {

    public static void main(String[] args) {
        System.out.println(minimumPartition("165462", 60));
    }

    /*
        Итерируемся по массиву чисел из строки, применяем тактику sliding window, путем:
            Первое окно делаем по разрядности k, для k = 333, это 3 символа
            Проходимся по массиву от края к края проверяя что int(arr[0]arr[1]arr[2]) <= k, в таком случае res++
            Когда массив окончен, мы подошли к концу, уменьшаем окно на 1 размер (--), если окно больше 0 продолжаем,
                иначе конец
     */
    public static int minimumPartition(String s, int k) {
        int res = 0;
        int winSize = String.valueOf(k).length();

        while (winSize > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (i + winSize > s.length()) break;
                int value = Integer.parseInt(s.substring(i, i + winSize));
//                res += value <= k ? 1 : 0;
                if (value <= k) System.out.println(value);
            }
            winSize--;
        }
        return Math.min(res, -1);
    }

}
