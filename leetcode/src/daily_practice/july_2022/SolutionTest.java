package daily_practice.july_2022;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void mostFlowers() {
        Solution solution = new Solution();
        int[][] a = new int[5][2];
        a[0][0] = 1;
        a[0][1] = 1;
        a[1][0] = 1;
        a[1][1] = 2;
        a[2][0] = 1;
        a[2][1] = 3;
        a[3][0] = 1;
        a[3][1] = 4;
        a[4][0] = 1;
        a[4][1] = 5;
        double ans = solution.shortestPath(5, 3, new int[]{1, 3}, new int[]{2, 3}, a);
        System.out.println(ans);
    }
}