package tech.ewrey._2124;

public class _2124 {

    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("aaabbba")); // false
        System.out.println(checkString("aaa")); // true
        System.out.println(checkString("bbb")); // true
    }

    public static boolean checkString(String s) {
        char[] arr = s.toCharArray();
        int a = 0;
        int b = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') a = i;
            else if (b == -1) b = i;
        }
        return a == 0 || b == -1 || a < b;
    }

}
