package daily_practice.march_2023.day15.question_1615;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximalNetworkRank() {

        Solution solution = new Solution();
        int[][] roads = {{0,1},{0,3},{1,2},{1,3}};
        int ans = solution.maximalNetworkRank(4, roads);
        System.out.println(ans);

    }
}