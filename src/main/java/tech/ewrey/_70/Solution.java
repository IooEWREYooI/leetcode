package tech.ewrey._70;

//You are climbing a staircase. It takes n steps to reach the top.
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can
//you climb to the top?
//
//
// Example 1:
//
//
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
//
//
// Example 2:
//
//
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
//
//
//
// Constraints:
//
//
// 1 <= n <= 45
//
//
// Related Topics Math Dynamic Programming Memoization 👍 23761 👎 990


//leetcode submit region begin(Prohibit modification and deletion)
public class Solution {

    public static void main(String[] args) {
        System.out.println(climbStairs(2) + " expected 2");
        System.out.println(climbStairs(3) + " expected 3");
        System.out.println(climbStairs(4) + " expected 5");
        System.out.println(climbStairs(5) + " expected 8");
        System.out.println(climbStairs(6) + " expected 13");
    }

    public static int climbStairs(int n) {
        /*
         * Вы поднимаетесь на лестницу.
         * Требуется n шагов, чтобы достичь вершины.
         * Каждый раз вы можете либо подняться на 1 или 2 шага.
         * Сколько отдельных способов вы можете подняться на вершину?
         *
         * Input: n = 3
         * Output: 3
         * Explanation: There are three ways to climb to the top.
         * 1. 1 step + 1 step + 1 step
         * 2. 1 step + 2 steps
         * 3. 2 steps + 1 step
         *
         * Input: n = 4
         * Output:
         * 1. 1 step + 1 step + 1 step + 1 step
         * 2. 1 step + 1 step + 2 step
         * 3. 1 step + 2 step + 1 step
         * 4. 2 step + 1 step + 1 step
         * 5. 2 step + 2 step
         * Algorithm
         * i = 1, k = 1
         */

        /*
         * Для начала я создал граф способный вычислить путь от 0 до n выбирая путь +1 или +2, получилось, n = 3
         *       0
         *      /-\
         *     1----2
         *    /-\----/-\
         *   2--|3|--4--|3|
         *  /-\
         * |3|---4
         * То есть 3 возможных решения
         * Если идти от обратного и с 3 лестницы спускаться к 0, то выясняется:
         * Стоя на 3 ступеньке добраться до нее можно будет 1 случаем это константа     [1]
         * Стоя на 2 ступеньке добраться до 3 можно тоже 1 новым случаем сделав 1 шаг   [1]
         * Стоя на 1 ступеньке, добраться до 3 можно суммой вышестоящих ступенек        [2]
         */
        
        int[] fib = new int[n + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }

        return fib[n];

    }

}
//leetcode submit region end(Prohibit modification and deletion)
