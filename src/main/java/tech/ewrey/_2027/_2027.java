package tech.ewrey._2027;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class _2027 {

    public static void main(String[] args) {
//        System.out.println(minimumMoves("XXOX"));
//        System.out.println(minimumMoves("XXX"));
//        System.out.println(minimumMoves("OOO"));
//        System.out.println(minimumMoves("OXOXO"));
        System.out.println(minimumMoves("OXXXOXXXOXXOXX"));
    }

    public static int minimumMoves(String s) {
        char[] arr = s.toCharArray();
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'X') {
             steps++;
             i += 2;
            }
        }

        return steps;
    }

}
