package tech.ewrey._1974;

public class _1974 {

    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
        System.out.println(minTimeToType("bza"));
        System.out.println(minTimeToType("zjpc"));
    }

    /*
        Итерируюсь по массиву, беру букву и по модулю определяю куда ближе идти к a или к z путем
        res += min(|x - 'a'|, |x - 'z'|) + 1
        И запоминаем нашу букву x для последующих вычислений
     */
    public static int minTimeToType(String word) {
        char[] arr = word.toCharArray();
        int res = Math.min(
                Math.abs('a' - arr[0]),
                Math.abs(Math.abs(arr[0] - 'a') - 26)
        );

        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            if (j == arr.length) continue;
            char char1 = arr[i];
            char char2 = arr[j];

            res += Math.min(
                    Math.abs(char1 - char2),
                    Math.abs(Math.abs(char2 - char1) - 26)
            );
        }

        return res + arr.length;
    }

}
