package tech.ewrey._441;

public class _441 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }

    public static int arrangeCoins(int n) {
        int i = 1;
        int res = -1;
        while (n >= 0) {
            n -= i;
            i++;
            res++;
        }
        return res;
    }

}
