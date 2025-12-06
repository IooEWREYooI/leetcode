package tech.ewrey._2710;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
        System.out.println(removeTrailingZeros("1720865079269529096765717822459"));
        System.out.println(removeTrailingZeros("50"));
        System.out.println(removeTrailingZeros("40000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
    }

    public static String removeTrailingZeros(String num) {
        if (num.length() == 2 && num.charAt(num.length() - 1) == '0') return num.charAt(0) + "";
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0') continue;
            return num.substring(0, i + 1);
        }

        return num;
    }

}
