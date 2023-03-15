package daily_practice.march_2023.day14.question_200;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numIslands() {
        Solution solution = new Solution();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        int ans = solution.numIslands(grid);
        System.out.println(ans);
    }
}