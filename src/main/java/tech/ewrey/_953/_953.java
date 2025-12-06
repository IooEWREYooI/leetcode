package tech.ewrey._953;

import tech.ewrey.util.Array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _953 {

    public static void main(String[] args) {
//        System.out.println(isAlienSorted(Array.of("hello","leetcode"), "hlabcdefgijkmnopqrstuvwxyz"));
//        System.out.println(isAlienSorted(Array.of("word","world","row"), "worldabcefghijkmnpqstuvxyz"));
//        System.out.println(isAlienSorted(Array.of("apple","app"), "abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(Array.of("hello","hello"), "abcdefghijklmnopqrstuvwxyz"));
//        System.out.println(isAlienSorted(Array.of("l","h"), "xkbwnqozvterhpjifgualycmds"));
    }

    /*
        Берем order кладем в мапу по логике буква - индекс

        Далее итерируемся по первым буквам words, (пока по первым) если map.get i > map.get j return false
        Если они равны то итерируемся уже не по первым а по остальным по той же логике если один из слов закончился,
            то переходим к следующему
     */
    public static boolean isAlienSorted(String[] words, String order) {
        char[] arr = order.toCharArray();
        Map<Character, Integer> map = new HashMap<>(arr.length + 1);
        map.put('\u0000', Integer.MIN_VALUE);
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        boolean res = true;
        char[] d;
        char[] c;
        for (int i = 0, j = 1; i < words.length; i++, j++) {
            if (j >= words.length) break;
            if (words[i].equals(words[j])) continue;

            c = new char[Math.max(words[i].length(), words[j].length())];
            d = new char[c.length];

            System.arraycopy(words[i].toCharArray(), 0, c, 0, words[i].length());
            System.arraycopy(words[j].toCharArray(), 0, d, 0, words[j].length());

            for (int v = 0; v < c.length; v++) {
                if (map.get(c[v]) < map.get(d[v])) {
                    res = true;
                    break;
                }
                else if (map.get(c[v]) > map.get(d[v])) {
                    return false;
                }
                else {
                    res = false;
                }
            }
        }
        return res;
    }

}
