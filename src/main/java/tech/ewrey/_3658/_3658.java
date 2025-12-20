package tech.ewrey._3658;

public class _3658 {

    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(4));
    }

    public static int gcdOfOddEvenSums(int n) {
        if (n == 1) return n;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = n * 2; i >= 1; i--) if (i % 2 == 0) sumEven += i; else sumOdd += i;
        return Math.max(sumOdd, sumEven) % Math.min(sumEven, sumOdd);
    }

}
