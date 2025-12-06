package tech.ewrey._160;

import tech.ewrey.util.ListNode;

import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class _160 {

    public static void main(String[] args) {
        ListNode merged = ListNode.by(3);
        System.out.println(
                getIntersectionNode(
                        ListNode.byList(List.of(2), merged),
                        merged
                )
        );
    }

    /*
        Итерируемся по всем спискам от начала до конца чтобы найти размер
            Далее имеем sizeA и sizeB, они либо равны, либо различны, допустим они равны
            Тогда, итерируемся проверяя непосредственно ссылки и когда headA.next == headB.next, возвращаем headA.next
                Если они различны, то наибольший нужно сопоставить до размера наименьшего, чтобы они стали равны
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) return headA;
        ListNode dummy = headA;
        int sizeA = 0;
        int sizeB = 0;
        while (dummy.next != null) {
            dummy = dummy.next;
            sizeA++;
        }
        dummy = headB;
        while (dummy.next != null) {
            dummy = dummy.next;
            sizeB++;
        }

        dummy = headA;
        ListNode dummyB = headB;

        if (sizeA != sizeB) {

            while (sizeB != sizeA) {
                if (sizeB > sizeA) {
                    dummyB = dummyB.next;
                    sizeB--;
                }
                else {
                    dummy = dummy.next;
                    sizeA--;
                }
            }
        }

        while (dummy != null) {
            if (dummyB == dummy) return dummy;
            dummy = dummy.next;
            dummyB = dummyB.next;
        }

        return null;
    }

}
