package daily_practice.march_2023.day14.question_463;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void islandPerimeter() {

        Solution solution = new Solution();
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int ans = solution.islandPerimeter(grid);
        System.out.println(ans);

    }
}