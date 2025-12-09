package tech.ewrey._203;

import tech.ewrey.util.ListNode;

import java.util.List;

public class _203 {

    public static void main(String[] args) {
        System.out.println(removeElements(ListNode.byList(List.of(6,1,2,6,6,3,4,5,6)), 6));
    }

    /*
        Итак, итерируемся по связному списку, двумя указателями
        Первый указатель указывает на -1 элемент к текущему, второй на текущий
        Если текущий val == val, указатель на предыдущий блокируем
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head), cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummy.next;
    }



}
