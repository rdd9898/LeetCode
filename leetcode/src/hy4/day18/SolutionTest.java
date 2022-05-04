package hy4.day18;

import org.junit.Test;

import static org.junit.Assert.*;

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