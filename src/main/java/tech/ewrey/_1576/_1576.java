package tech.ewrey._1576;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class _1576 {

    public static void main(String[] args) {
//        System.out.println(modifyString("?zs"));
        System.out.println(modifyString("?a?zs"));
        System.out.println(modifyString("???a?zs"));
//        System.out.println(remakeString("aaazs".toCharArray(), List.of(0, 2)));
    }

    /*
        ???a?zs ->
        aaaazas ->
        acbaczs
     */
    public static String modifyString(String s) {
        char[] arr = s.toCharArray();
        Set<Integer> indexes = new HashSet<>(s.length());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                indexes.add(i);
                arr[i] = 'a';
            }
        }
        return remakeString(arr, indexes);
    }

    private static String remakeString(char[] arr, Collection<Integer> indexes) {
        boolean con = true;
        while (con) {
            boolean a = false;
            for (int i = 0, l = i - 1, n = i + 1; i < arr.length; i++, l = i - 1, n = i + 1) {
                if ((l >= 0 && arr[l] == arr[i]) || (n < arr.length && arr[n] == arr[i])) {
                    if (indexes.contains(i)) {
                        arr[i] = arr[i] + 1 <= 'z' ? (char) (arr[i] + 1) : 'a';
                        a = true;
                    }
                }
            }
            con = a;
        }
        return new String(arr);
    }

}
