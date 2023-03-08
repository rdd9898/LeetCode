package daily_practice.march_2023.day08.offer_47;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxValue() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Solution solution = new Solution();
        int ans = solution.maxValue(grid);
        System.out.println(ans);
    }
}