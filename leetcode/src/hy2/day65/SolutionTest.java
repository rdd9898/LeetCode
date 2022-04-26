package hy2.day65;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void countNumbersWithUniqueDigits() {
        int n = 2;
        Solution solution = new Solution();
        int ans = solution.countNumbersWithUniqueDigits(n);
        System.out.println(ans);
    }
}