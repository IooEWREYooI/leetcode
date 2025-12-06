package tech.ewrey._2085;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(
                countWords(
                        new String[]{"leetcode","is","amazing","as","is"},
                        new String[]{"amazing","leetcode","is"}
                )
        );
        System.out.println(
                countWords(
                        new String[]{"a","ab"},
                        new String[]{"a","a","a","ab"}
                )
        );
    }

    /*
        Алгоритм должен отобразить кол-во слов, которые содержатся в 2-ух массивах ровно 1 раз в каждом
        Берем 1 слово из words1 и words2 leetcode, amazing
        Если слово содержится и в words1 и в words2, откладываем его в отдельное множество
        Далее работаем со множеством
        Берем первое число из множества и проверяем сколько раз оно содержится в words1 и words2, если ответ == 1 и там
            и там, кладем в result лист
     */
    public static int countWords(String[] words1, String[] words2) {
        String[] maxArr = words1.length >= words2.length ? words1  : words2;
        List<String> list1 = Arrays.asList(words1);
        List<String> list2 = Arrays.asList(words2);
        Set<String> set = new HashSet<>();

        for (int i = 0; i < maxArr.length; i++) {
            String val1 = i <= list1.size() - 1 ? list1.get(i) : null;
            String val2 = i <= list2.size() - 1 ? list2.get(i) : null;

            if (list2.contains(val1)) set.add(val1);
            if (list1.contains(val2)) set.add(val2);
        }

        int res = 0;

        for (String word : set) {
            int _1 = 0;
            int _2 = 0;
            for (String val1 : list1) {
                if (val1.equals(word)) {
                    _1++;
                }
            }

            for (String val2 : list2) {
                if (val2.equals(word)) {
                    _2++;
                }
            }
            if (_1 == 1 && _1 == _2) {
                res++;
            }
//            System.out.printf("word %s, 1: %s, 2: %s\n", word, _1, _2);
        }

        return res;
    }

}
