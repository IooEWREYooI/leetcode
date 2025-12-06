package tech.ewrey._2;

import tech.ewrey.util.ListNode;

import java.math.BigInteger;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(
                addTwoNumbers(
                        ListNode.byList(List.of(2,4,3)),
                        ListNode.byList(List.of(5,6,4))

                )
        );

        System.out.println(
                addTwoNumbers(
                        ListNode.byList(List.of(9,9,9,9,9,9,9)),
                        ListNode.byList(List.of(9,9,9,9))

                )
        );

        System.out.println(
                addTwoNumbers(
                        ListNode.byList(List.of(9)),
                        ListNode.byList(List.of(1,9,9,9,9,9,9,9,9,9))

                )
        );

        System.out.println(
                addTwoNumbers(
                        ListNode.byList(List.of(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1)),
                        ListNode.byList(List.of(5,6,4))

                )
        );
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>(), stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
        while (!stack1.isEmpty()) {
            sb1.append(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            sb2.append(stack2.pop());
        }

        String[] arr = (new BigInteger(sb1.toString()).add(new BigInteger(sb2.toString()))).toString().split("");
        ListNode result = new ListNode(), dummy = result;

        for (int i = arr.length - 1; i >= 0; i--) {
            result.next = new ListNode(Integer.parseInt(arr[i]));
            result = result.next;
        }

        return dummy.next;
    }

}
