package tech.ewrey._693;

public class _693 {

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(Integer.MAX_VALUE));
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
    }

    public static boolean hasAlternatingBits(int n) {
        char[] binChars = Integer.toBinaryString(n).toCharArray();
        for (int i = 0, k = i + 1; i < binChars.length; i++, k++) {
            if (k >= binChars.length) break;

            if (binChars[i] == binChars[k]) return false;
        }
        return true;
    }

}
