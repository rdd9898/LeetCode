package hy4.day21;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void exchangeBits() {
        int num = 1;
        Solution solution = new Solution();
        int ans = solution.exchangeBits(num);
        System.out.println(ans);
    }
}