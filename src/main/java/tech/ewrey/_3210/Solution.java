package tech.ewrey._3210;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getEncryptedString("dart", 7));
    }

    public static String getEncryptedString(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int y1 = 0, y2 = y1 + k % s.length(); y1 < s.length(); y1++, y2++) {
            if (y2 >= s.length()) y2 = 0;
            sb.append(s.charAt(y2));
        }
        return sb.toString();
    }
}
