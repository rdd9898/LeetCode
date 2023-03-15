package daily_practice.march_2023.day14.question_1605;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void restoreMatrix() {
        Solution solution = new Solution();
        int[] rowSum = new int[]{3, 8};
        int[] colSum = new int[]{4, 7};
        int[][] ans = solution.restoreMatrix(rowSum, colSum);
        for (int[] ints : ans) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}