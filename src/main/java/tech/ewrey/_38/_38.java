package tech.ewrey._38;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class _38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    /*
        Логика такая, мы получаем число, например 4, мы добавляем в base символ '1'
            делаем RLE 4 раза, такой логикой:
                кладем первый символ в очередь
                переходим к следующему символу
                если следующий символ уже есть в очереди, кладем и его
                если следующего символа нет в очереди или след символа нет вовсе
                    (он уникальный, не повторяющийся), перед этим символом делаем следующее
                q.size + q.pop

                RLE(21)

     */
    public static String countAndSay(int n) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('1');
        for (int i = 1; i < n; i++) {
            list = RLE(list);
        }
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        return sb.toString();
    }

    private static LinkedList<Character> RLE(LinkedList<Character> list) {
        Deque<Character> q = new LinkedList<>();
        LinkedList<Character> res = new LinkedList<>();
        int i = 0;
        for (char a : list) {
            if (q.isEmpty() || q.contains(a)) {
                q.add(a);
            } else {
                rebaseQueue(q, res, a);
            }
            if (i == list.size() - 1) {
                rebaseQueue(q, res, a);
            }
            i++;
        }
        return res;
    }

    private static void rebaseQueue(Deque<Character> q, LinkedList<Character> res, char a) {
        char[] _1 = (q.size() + "").toCharArray();
        char _2 = q.pop();
        for (char c : _1) res.add(c);
        res.add(_2);
        q.clear();
        q.add(a);
    }

}
