package tech.ewrey._1816;

public class _1816 {

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder(Math.min(s.length(), k));
        for (int i = 0; i < Math.min(s.length(), k); i++) sb.append(split[i]).append(" ");
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
