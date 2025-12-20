package tech.ewrey._3360;

public class _3360 {

    public static void main(String[] args) {
        System.out.println(canAliceWin(1));
    }

    public static boolean canAliceWin(int n) {
        if (n < 10) return false;
        n -= 10;
        boolean res = true;
        for (int s = 9; n >= 0; s--) {
            n -= s;
            res = (n >= 0) != res;
        }
        return res;
    }

}
