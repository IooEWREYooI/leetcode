package tech.ewrey._3683;

public class _3683 {

    public static void main(String[] args) {
        System.out.println();
    }

    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;

        for (int[] i : tasks) {
            int sum = 0;
            for (int a : i) {
                sum += a;
            }
            min = Math.min(min, sum);
        }
        return min;
    }

}
