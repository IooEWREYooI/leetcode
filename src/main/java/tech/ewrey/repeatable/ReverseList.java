package tech.ewrey.repeatable;

import tech.ewrey.util.ListNode;

public class ReverseList {

    public static void main(String[] args) {
        System.out.println(reverseList_v2(ListNode.by(1,2,3,4,5,6,7,8)));
    }

    static ListNode reverseList_v2(ListNode head) {
        ListNode prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
