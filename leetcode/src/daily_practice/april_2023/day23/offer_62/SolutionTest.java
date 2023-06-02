package daily_practice.april_2023.day23.offer_62;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void lastRemaining() {
        int n = 10;
        int m = 3;
        Solution solution = new Solution();
        int ans = solution.lastRemaining(n, m);
        System.out.println(ans);
    }
}