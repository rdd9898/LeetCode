package hy4.day06;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxRotateFunction() {
        int[] nums = {4, 3, 2, 6};
        Solution solution = new Solution();
        int ans = solution.maxRotateFunction2(nums);
        System.out.println(ans);
    }
}