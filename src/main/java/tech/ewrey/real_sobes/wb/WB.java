package tech.ewrey.real_sobes.wb;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class WB {
    /*
Есть матрица n на m. 1-суша, 0-вода. Нужно сосчитать кол-во островов.
Остров - это произвольный фрагмент суши, не соединенный с другими участками суши.
Связь по диагонали - не считается. Все, что за пределами матрицы - вода

Example 1:

Input: grid = [
    ["1", "1", "1", "1", "0"],
    ["1", "1", "0", "1", "0"],
    ["1", "1", "0", "0", "0"],
    ["0", "0", "0", "0", "0"]
]

Output: 1

Example 2:

Input: grid = [
    ["1", "1", "0", "0", "0"],
    ["1", "1", "0", "0", "0"],
    ["0", "0", "1", "0", "0"],
    ["0", "0", "0", "1", "1"]
]

Output: 3
     */

    public static int getIslandCount(char[][] grid) {
        Stack<int[]> tmp = new Stack<>();
        int[] stackPop;
        int res = 0, i, p;
        for (int[] earthPoint = getEarth(grid); earthPoint != null; earthPoint = getEarth(grid), res++) {
            tmp.push(earthPoint);
            while (!tmp.isEmpty()) {
                stackPop = tmp.pop();
                i = stackPop[0];
                p = stackPop[1];

                if (p - 1 >= 0) { // left check
                    check(tmp, grid, new int[]{i, p - 1});
                }
                if (p + 1 < grid[i].length) { // right check
                    check(tmp, grid, new int[]{i, p + 1});
                }
                if (i - 1 >= 0) { // up check
                    check(tmp, grid, new int[]{i - 1, p});
                }
                if (i + 1 < grid.length) { // down check
                    check(tmp, grid, new int[]{i + 1, p});
                }
                grid[i][p] = '0';
            }
            printMatrix(grid);
        }
        return res;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char a : arr) {
                System.out.print(a);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void check(Stack<int[]> stack, char[][] matrix, int[] point) {
        if (matrix[point[0]][point[1]] == '1') {
            stack.push(point);
            matrix[point[0]][point[1]] = '0';
        }
    }

    private static int[] getEarth(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int p = 0; p < matrix[i].length; p++) {
                if (matrix[i][p] == '1') return new int[]{i, p};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(getIslandCount(new char[][]{
                new char[]{'1','1','0','0','0'},
                new char[]{'1','1','0','0','0'},
                new char[]{'0','0','1','0','0'},
                new char[]{'0','0','0','1','1'}
        }));
//        System.out.println(getIslandCount(new int[][]{
//                new int[]{1,1,1,1,0},
//                new int[]{1,1,0,1,0},
//                new int[]{1,1,0,0,0},
//                new int[]{0,0,0,1,1}
//        }));
//        System.out.println(getIslandCount(new int[][]{
//                new int[]{1,1,1,1,0},
//                new int[]{1,1,0,1,0},
//                new int[]{1,1,1,1,0},
//                new int[]{0,0,0,1,1}
//        }));
//        System.out.println(getIslandCount(new int[][]{
//                new int[]{1,1,1,1,0,1},
//                new int[]{0,0,0,0,0,1},
//                new int[]{1,1,1,1,0,1},
//                new int[]{0,0,0,1,1,0}
//        }));
    }
}
