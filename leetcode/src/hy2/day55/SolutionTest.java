package hy2.day55;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void hasAlternatingBits() {
        int n = 7;
        Solution solution = new Solution();
        boolean ans = solution.hasAlternatingBits(n);
        System.out.println(ans);
    }
}