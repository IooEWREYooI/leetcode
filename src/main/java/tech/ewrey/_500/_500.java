package tech.ewrey._500;

import tech.ewrey.util.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class _500 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(Array.of("Hello","Alaska","Dad","Peace"))));
    }

    static List<char[]> keyBoardRows = List.of(
            "qwertyuiop".toCharArray(),
            "asdfghjkl".toCharArray(),
            "zxcvbnm".toCharArray()
    );


    public static String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyBoardRows.size(); i++) {
            for (char a : keyBoardRows.get(i)) {
                map.put(a, i);
            }
        }
        List<String> res = new ArrayList<>();
        for (String w : words) {
            int tmp = -1;
            boolean inRes = true;
            for (char a : w.toLowerCase(Locale.ROOT).toCharArray()) {
                int rowNum = map.get(a);
                if (tmp == -1) tmp = rowNum;
                else if (tmp != rowNum) {
                    inRes = false;
                    break;
                }
            }
            if (inRes) res.add(w);
        }

        return res.toArray(new String[]{});
    }

}
