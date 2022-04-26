package hy4.day07;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void binaryGap() {

        int n = 22;
        Solution solution = new Solution();
        int ans = solution.binaryGap(n);
        System.out.println(ans);

    }
}