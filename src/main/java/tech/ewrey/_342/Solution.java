package tech.ewrey._342;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));
        System.out.println(isPowerOfFour(24));
        System.out.println(isPowerOfFour(16 * 4));
        System.out.println(isPowerOfFour(16 * 2));
        System.out.println(isPowerOfFour(16 * 4 * 4));
    }

    public static boolean isPowerOfFour_v0(int n) {
        if (n == 1) return true;
        else if (n == 0) return false;

        Set<Integer> allPowersOfFour = new HashSet<>();
        int num = 4;
        for (int i = 0; i < 1000; i++) {
            try {
                allPowersOfFour.add(num);
                num *=4;
            } catch (Exception ignored) {
                break;
            }
        }
        return allPowersOfFour.contains(n);
    }

    public static boolean isPowerOfFour(int n) {
//        if (n == 4) return true; else if (n < 4) return false; else return isPowerOfFour( n / 4);
        return n == 4 || (n >= 4 && isPowerOfFour(n / 4));
    }

}
