package Algorithm.Introduction_to_algorithms.fourth_chapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMaximumSubarray() {
        int[] array = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int low = 0;
        int high = array.length - 1;
        Solution solution = new Solution();
//        int[] answers = solution.findMaximumSubarray(array, low, high);
        int[] answers = solution.iterativeFindMaximumSubarray(array);
        for (int answer : answers) {
            System.out.println(answer);
        }
    }

    @Test
    public void testSquareMatrixMultiply() {
        int[][] matrix1 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        Solution solution = new Solution();
        int[][] matrixMultiply = solution.squareMatrixMultiply(matrix1, matrix2);
        for (int[] ints : matrixMultiply) {
            for (int i : ints) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}