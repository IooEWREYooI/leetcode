package tech.ewrey._21;

//You are given the heads of two sorted linked lists list1 and list2.
//
// Merge the two lists into one sorted list. The list should be made by
//splicing together the nodes of the first two lists.
//
// Return the head of the merged linked list.
//
//
// Example 1:
//
//
//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
//
//
// Example 2:
//
//
//Input: list1 = [], list2 = []
//Output: []
//
//
// Example 3:
//
//
//Input: list1 = [], list2 = [0]
//Output: [0]
//
//
//
// Constraints:
//
//
// The number of nodes in both lists is in the range [0, 50].
// -100 <= Node.val <= 100
// Both list1 and list2 are sorted in non-decreasing order.
//
//
// Related Topics Linked List Recursion 👍 24088 👎 2362


//leetcode submit region begin(Prohibit modification and deletion)

import tech.ewrey.util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(3, new ListNode(7)));
        ListNode list4 = new ListNode(5, new ListNode(6));

        System.out.println(mergeTwoLists(list3, list4));
//        System.out.println(mergeTwoLists(List.of(1, 2, 4), List.of(1, 3, 4)));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Input: list1 = [1,2,4], list2 = [1,3,4]
        //Output: [1,1,2,3,4,4]

        // Взять 1 элемент у 1 list1[1] листа, и 1 list2[1] элемент у второго

        ListNode dummy = new ListNode();
        ListNode tail = dummy; // Хвост

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                /* Если значение первого списка меньше значения второго то в хвост вставляем список 1
                 * Список 1 обновляем следующим значением list1.next
                 */
                tail.next = list1;
                list1 = list1.next;
            } else {
                /*
                 * Если же list2.val больше list1.val или они равны
                 * Обновляем указатель хвоста на список 2
                 * Обновляем указатель списка 2 на следующий
                 */
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        /*
         * Если после прохода по всем элементам списка у нас закончился только 1 из 2
         * list1 [0,1]      -> []
         * list2 [0,2,4,5]  -> [4,5]
         * Добавляем оставшийся к указателю на следующий к хвосту
         */
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        /* Вернуть стоит не весь dummy а лишь все его последующие списки,
         * первый список внутри него всегда new ListNode()
         */
        return dummy.next;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

