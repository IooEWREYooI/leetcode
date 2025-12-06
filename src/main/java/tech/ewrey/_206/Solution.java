package tech.ewrey._206;

import tech.ewrey.util.ListNode;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseList(
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2,
                                                new ListNode(2,
                                                        new ListNode(3))))))
        ));
        System.out.println(reverseList(new ListNode(1, new ListNode(2))));
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(2)))));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        ListNode dummy = result;
        Stack<Integer> stack = new Stack<>();

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        while (head.next != null) {
            head = head.next;
            stack.push(head.val);
        }

        while (!stack.isEmpty()) {
            result.next = new ListNode(stack.pop());
            result = result.next;
        }

        return dummy.next;
    }

//    public static ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.next == null) {
//            return head;
//        }
//        ListNode result = new ListNode();
//        ListNode last = head;
//        ListNode temp = head;
//        ListNode dummy = result;
//
//        while (last.next != null) {
//            last = last.next;
//        }
//
//        result.next = last;
//        result = result.next;
//
//        while (last != head) {
//            while (temp.next != last) {
//                temp = temp.next;
//            }
//
//            result.next = new ListNode(temp.val);
//            result = result.next;
//
//            last = temp;
//            temp = head;
//        }
//
//        return dummy.next;
//    }

}
