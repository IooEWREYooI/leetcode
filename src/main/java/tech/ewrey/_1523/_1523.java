package tech.ewrey._1523;

public class _1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(3, 9));
    }

    public static int countOdds(int low, int high) {
        int res = 0;
        for (int i = low, k = 1; i <= high; i+= k) {
            if (i % 2 != 0) {
                System.out.println(i);
                res++;
                k = 2;
            }
        }
        return res;
    }

}
