package tech.ewrey.algos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GrokaemAlgorithms {

    public static void main(String[] args) {
//        System.out.println(quickSort(List.of(1,5,3,10,-1)));
//        var map = Map.of("Sanny", List.of("Jonhy", "Bonny", "Vinny"),
//                "Honey", List.of("Alony", "Posu", "Yuoi"),
//                "Voney", List.of("Jonhy", "Ferr", "Hert")
//        );
//        System.out.println(bfs(map, "Hert"));
//        System.out.println(bfs(map, "Herasdt"));
//        System.out.println(bfs(map, "Posu"));
    }

    public static void coveringProblem(List<Integer> arr) {

    }

    public static boolean bfs(Map<String, List<String>> graph, String name) {

        Deque<String> searchQueue = new ArrayDeque<>(graph.keySet());
        List<String> searched = new ArrayList<>();
        while (!searchQueue.isEmpty()) {
            String person = searchQueue.pop();
            if (!searched.contains(person)) {
                if (Objects.equals(person, name)) {
                    System.out.println("Founded: " + name);
                    return true;
                } else {
                    List<String> subGraph = graph.get(person);
                    if (subGraph != null) {
                        searchQueue.addAll(graph.get(person));
                    }
                    searched.add(person);
                }
            }
        }

        return false;

    }

    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        } else {
            Integer pivot = arr.get(0);
            List<Integer> less = new ArrayList<>(), greater = new ArrayList<>();
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) <= pivot) {
                    less.add(arr.get(i));
                } else {
                    greater.add(arr.get(i));
                }
            }

            List<Integer> result = new ArrayList<>(quickSort(less));

            result.add(pivot);

            result.addAll(quickSort(greater));

            return result;

        }
    }

}
