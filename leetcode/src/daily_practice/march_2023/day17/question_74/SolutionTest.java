package daily_practice.march_2023.day17.question_74;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchMatrix() {

        Solution solution = new Solution();
        int[][] matrix = {{1}};
        int target = 1;
        boolean ans = solution.searchMatrix(matrix, target);
        System.out.println(ans);

    }
}