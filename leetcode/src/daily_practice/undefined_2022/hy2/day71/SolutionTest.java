package daily_practice.undefined_2022.hy2.day71;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void projectionArea() {
        int[][] grid = {{1, 2}, {3, 4}};
        Solution solution = new Solution();
        int ans = solution.projectionArea(grid);
        System.out.println(ans);
    }
}