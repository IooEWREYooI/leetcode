package tech.ewrey._2309;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(greatestLetter("lEeTcOdE"));
        System.out.println(greatestLetter("arRAzFif"));
    }

    public static String greatestLetter(String s) {
        Set<Character> upSet = new TreeSet<>(Comparator.reverseOrder());
        Set<Character> downSet = new TreeSet<>(Comparator.reverseOrder());
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') downSet.add((char) (c + ('A' - 'a')));
            else upSet.add(c);
        }
        upSet.removeIf(x -> !downSet.contains(x));
        return upSet.stream().map(String::valueOf).findFirst().orElse("");
    }

}
