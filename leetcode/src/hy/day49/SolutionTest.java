package hy.day49;

import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void test() {
        int[][] edges = {{0,1},{1,2}};
        int[] patience = {0,2,1};
        int ans = Solution.networkBecomesIdle(edges, patience);
        System.out.println(ans);
    }

}