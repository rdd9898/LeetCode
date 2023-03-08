package daily_practice.march_2023.day08.question_1091;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shortestPathBinaryMatrix() {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        Solution solution = new Solution();
        int ans = solution.shortestPathBinaryMatrix(grid);
        System.out.println(ans);
    }
}