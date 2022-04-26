package hy2.day61;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countPrimeSetBits() {
        int left = 6;
        int right = 10;
        Solution solution = new Solution();
        int ans = solution.countPrimeSetBits(left, right);
        System.out.println(ans);
    }
}