package tech.ewrey._434;

import java.util.Arrays;

public class _434 {

    public static void main(String[] args) {
        System.out.println(countSegments("Of all the gin joints in all the towns in all the world,   "));
        System.out.println(countSegments(""));
    }

    public static int countSegments(String s) {
        return (int) Arrays.stream(s.split(" ")).filter(x -> !x.isBlank()).count();
    }

}
