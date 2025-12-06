package tech.ewrey._3407;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _3407 {

    public static void main(String[] args) {
//        System.out.println(hasMatch("leetcode", "ee*e"));
//        System.out.println(hasMatch("car", "c*v"));
//        System.out.println(hasMatch("luck", "u*"));
//        System.out.println(hasMatch("l", "*"));
//        System.out.println(hasMatch("hccc", "m*c"));
        System.out.println(hasMatch("jjj", "*j"));
    }

    public static boolean hasMatch(String s, String p) {
        if (p.equals("*")) return true;
        String[] split = p.split("\\*");
        return split.length > 1
                ? s.indexOf(split[0]) > 0 && s.indexOf(split[0]) < s.lastIndexOf(split[1])
                : s.contains(split[0]);
    }

}
