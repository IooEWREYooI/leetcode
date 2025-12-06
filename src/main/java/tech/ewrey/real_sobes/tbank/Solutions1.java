package tech.ewrey.real_sobes.tbank;

import tech.ewrey.util.ListNode;

import java.util.Arrays;
import java.util.Stack;

public class Solutions1 {

    /*
        1 Задачка с матрицей ин-тов найти максимальную сумму пересечения столбца и строки
        (все элементы из строки + все элементы из столбца) была аналогия типо ладья в какой-то клетке
        нужно максимум посчитать

        [1,2,3,4],10
        [1,2,3,4],10
         2,4,6,8

        2 проверить что односвязный список является палиндромом
     */

    public static void main(String[] args) {
        System.out.println(task1(
                new int[] {1,2,3,4},
                new int[] {1,2,3,4},
                new int[] {1,2,3,4}
        ));
        System.out.println(task1(
                new int[] {0,0,0,0},
                new int[] {1,0,0,-1},
                new int[] {0,0,0,2}
        ));
        System.out.println(task1(
                new int[] {22,-3,-7,-2},
                new int[] {-21,-4,-4,-8},
                new int[] {-1,-1,-4,-1}
        ));
    }

    /*
        [1, 2,  3,  4]
        [5, 6,  7,  8]
        [9, 10, 11, 12]


        Берем 1 массив в матрице - [1,2,3,4]
        Вычисляем сумму всех элементов 10 - это сумма всех элементов из строки
        Теперь надо вычислить сумму всех элементов из столбца, для этого нужно пройтись по каждому массиву 1 указателем

            arr[0][0]
            arr[1][0]
            arr[2][0]
            sumColumn

            arr[0][1]
            arr[1][1]
            arr[2][1]
            sumColumn

            arr[0][2]
            arr[1][2]
            arr[2][2]
            sumColumn

            arr[0][3]
            arr[1][3]
            arr[2][3]
            sumColumn

     */

    public static int task1(int[]... matrix) {
        int result = Integer.MIN_VALUE;
        Stack<String> stack = new Stack<>();
        for (int i = 0, sumRow = 0, columnIndex = i; i < matrix.length; i++, columnIndex = i) {
            for (int numIndex = 0, sumColumn = 0, tmpResult; numIndex < matrix[columnIndex].length; numIndex++) {
                sumRow += matrix[columnIndex][numIndex];
//                System.out.printf("matrix[%s][%s]---sumRow:%s%n", columnIndex, numIndex, sumRow);
                int tempColumnIndex = 0;
                while (tempColumnIndex != matrix.length) {
                    sumColumn += matrix[tempColumnIndex][numIndex];
//                    System.out.printf("---matrix[%s][%s]%n", tempColumnIndex, numIndex);
                    tempColumnIndex++;
                }
//                System.out.printf("---sumColumn:%s%n", sumColumn);
                tmpResult = Math.max(result, sumColumn + sumRow - matrix[columnIndex][numIndex]);
                if (tmpResult != result) {
                    stack.push("[%s][%s]".formatted(columnIndex, numIndex));
                }
                result = tmpResult;
                sumColumn = 0;
            }
            sumRow = 0;
        }
        System.out.println(stack.pop());
        return result;
    }

    public static boolean task2(ListNode listNode) {
        ListNode dummy = listNode;
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        listNode = dummy;
        while (listNode.next != null) {
            if (stack.pop() != listNode.val) return false;
            listNode = listNode.next;
        }
        return true;
    }
}
