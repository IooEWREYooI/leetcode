package tech.ewrey.util;

import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode byList(List<Integer> list) {
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return by(array);
    }

    public static ListNode byList(List<Integer> list, ListNode listNode) {
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        ListNode a = by(array);
        ListNode dummy = a;
        while (dummy.next != null) dummy = dummy.next;
        dummy.next = listNode;
        return a;
    }

    public static ListNode by(int... list) {
        ListNode result = new ListNode();
        ListNode dummy = result;
        for (int a : list) {
            result.next = new ListNode(a);
            result = result.next;
        }
        return dummy.next;
    }

    @Override
    public String toString() {
        return val + "-" + next;
    }
}
