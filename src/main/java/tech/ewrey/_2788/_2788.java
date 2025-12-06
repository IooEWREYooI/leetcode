package tech.ewrey._2788;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class _2788 {

    public static void main(String[] args) {
        System.out.println(splitWordsBySeparator(List.of("one.two.three","four.five","six"), '.'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        return words.stream().flatMap(x -> Arrays.stream(x.split("\\" + separator))).filter(x -> !x.isBlank()).toList();
    }

}
