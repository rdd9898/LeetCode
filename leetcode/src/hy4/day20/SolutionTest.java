package hy4.day20;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numSubarrayProductLessThanK() {

        int[] nums = {10, 5, 2, 6};
        int k = 100;
        Solution solution = new Solution();
        int ans = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println(ans);

    }
}