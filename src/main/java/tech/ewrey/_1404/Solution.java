package tech.ewrey._1404;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        System.out.println(numSteps("1101"));
        System.out.println(numSteps("10"));
        System.out.println(numSteps("1"));
        System.out.println(numSteps("1111011110000011100000110001011011110010111001010111110001"));
        System.out.println(numSteps("1111110011101010110011100100101110010100101110111010111110110010"));
    }

    public static int numSteps(String s) {
        BigInteger bigInteger = new BigInteger(s, 2);
        long num = bigInteger.longValue();
        int i = 0;
        while (num > 1) {
            if (num % 2 != 0) {
                num += 1;
            } else {
                num = num / 2;
            }
            i++;
        }
        return i;
    }

}
