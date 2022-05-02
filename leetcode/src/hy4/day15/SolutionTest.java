package hy4.day15;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void nearestValidPoint() {

        int x = 3;
        int y = 4;
        int[][] points = {{1,2}, {3,1}, {2,4}, {2,3}, {4,4}};
        Solution solution = new Solution();
        int ans = solution.nearestValidPoint(x, y, points);
        System.out.println(ans);

    }
}