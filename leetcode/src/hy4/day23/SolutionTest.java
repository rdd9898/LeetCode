package hy4.day23;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void bitwiseComplement() {

        int n = 5;
        Solution solution = new Solution();
        int ans = solution.bitwiseComplement(n);
        System.out.println(ans);

    }
}