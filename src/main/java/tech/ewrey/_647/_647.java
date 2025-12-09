package tech.ewrey._647;

public class _647 {

    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
        System.out.println(countSubstrings("abc"));
//        System.out.println(isPalindrome("abccazcba"));
    }

    public static int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int k = 1; k <= s.length(); k++) {
                if (i + k > s.length()) break;
                if (isPalindrome(s.substring(i, k + i))) res++;
            }
        }
        return res;
    }

    private static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int a = 0;
        int b = arr.length - 1;
        while (a <= b) {
            if (arr[a] != arr[b]) return false;
            a++;
            b--;
        }
        return true;
    }

}
