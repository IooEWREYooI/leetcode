package tech.ewrey._1309;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _1309 {

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
    }

    public static String freqAlphabets(String s) {
        for (int i = 'j'; i <= (int) 'z'; i++) {
            s = s.replaceAll(i - 'a' + 1 + "#", (char) i + "");
        }
        for (int i = 'a'; i <= (int) 'i'; i++) {
            s = s.replaceAll(i - 'a' + 1 + "", (char) i + "");
        }
        return s;
    }

}
