package tech.ewrey._83;

import tech.ewrey.util.ListNode;

public class Solution {

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(2,
                                                        new ListNode(3))))))
        ));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(2))));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(2)))));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode result = new ListNode(head.val);
        ListNode dummy = result;

        while (head.next != null) {
            if (result.val != head.next.val) {
                result.next = new ListNode(head.next.val);
                result = result.next;
            }
            head = head.next;
        }
        return dummy;
    }

}
