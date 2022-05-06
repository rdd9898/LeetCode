package daily_practice.undefined_2022.hy2.day52;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void findKthNumber() {
        int n = 10;
        int k = 3;
        Solution solution = new Solution();
        int ans = solution.findKthNumber(n, k);
        System.out.println(ans);
    }
}