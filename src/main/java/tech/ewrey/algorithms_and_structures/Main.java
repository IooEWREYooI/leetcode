package tech.ewrey.algorithms_and_structures;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        i.add(3);
        i.add(4);
        i.add(8);
        i.add(6);
        System.out.println(reverseLinkedList(i));

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        for (Integer integer : list) {
            stack.push(integer);
        }
        LinkedList<Integer> result = new LinkedList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
