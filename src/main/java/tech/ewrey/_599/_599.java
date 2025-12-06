package tech.ewrey._599;

import tech.ewrey.util.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class _599 {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        findRestaurant(
                                Array.of("Shogun","Tapioca Express","Burger King","KFC"),
                                Array.of("Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun")
                        )
                )
        );

        System.out.println(
                Arrays.toString(
                        findRestaurant(
                                Array.of("happy","sad","good"),
                                Array.of("sad","happy","good")
                        )
                )
        );
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < Math.max(list1.length, list2.length); i++) {
            if (i < list1.length) {
                List<Integer> j = map.getOrDefault(list1[i], new ArrayList<>(2));
                j.add(i);
                map.put(list1[i], map.getOrDefault(list1[i], j));
            }
            if (i < list2.length) {
                List<Integer> j = map.getOrDefault(list2[i], new ArrayList<>(2));
                j.add(i);
                map.put(list2[i], map.getOrDefault(list2[i], j));
            }
        }
        Queue<List<String>> queue = new PriorityQueue<>(Comparator.comparingInt(x -> Integer.parseInt(x.get(0))));
        for (var kv : map.entrySet()) {
            if (kv.getValue().size() == 2) queue.add(
                    List.of(kv.getValue().stream().mapToInt(x -> x).sum() + "", kv.getKey()
            ));
        }

        Integer h = null;
        List<String> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            var o = queue.poll();
            int tmp = Integer.parseInt(o.get(0));
            if (h == null) h = tmp;
            else if (h != tmp) break;
            res.add(o.get(1));
        }

        return res.toArray(new String[]{});
    }

}
