package daily_practice.april_2023.day23.offer_29;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void spiralOrder() {
        int[][] martix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};
        Solution solution = new Solution();
        int[] ans = solution.spiralOrder(martix);
        for (int an : ans) {
            System.out.println(an);
        }
    }
}