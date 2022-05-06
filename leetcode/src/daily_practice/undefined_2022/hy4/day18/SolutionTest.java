package daily_practice.undefined_2022.hy4.day18;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void findTheWinner() {

        int n = 5;
        int k = 2;
        Solution solution = new Solution();
        int ans = solution.findTheWinner(n, k);
        System.out.println(ans);

    }
}