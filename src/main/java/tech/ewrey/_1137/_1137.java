package tech.ewrey._1137;

public class _1137 {

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }

    // 0 1 = 1
    // 1 1 = 2
    // 2 1 = 3
    // 2 3 = 5
    // 5 3 = 8
    public static int tribonacci(int n) {
        int res = 0;
        for (int prev = 0, curr = 1, sum = prev + curr, i = 0; i < n - 1 ; prev = curr, curr = sum, sum = prev + curr, i++) {
//            System.out.println("prev = " + prev);
//            System.out.println("curr = " + curr);
//            System.out.println("sum = " + sum);
//            System.out.println();
            res += curr;
        }
        return res;
    }

}
