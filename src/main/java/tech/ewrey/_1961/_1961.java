package tech.ewrey._1961;

public class _1961 {

    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
    }

    /*
        Итерируемся по words,
            если !s.startWith(words[i]) return false
            иначе, s.substring(words[i].size, s.size)

            Если после этого s == "", то return true

     */
    public static boolean isPrefixString(String s, String[] words) {
        for (String prefix : words) {
            if (s.startsWith(prefix)) {
                s = s.substring(prefix.length());
                if (s.isBlank()) return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
