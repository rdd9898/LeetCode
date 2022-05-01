package hy4.day14;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximumProduct() {

        int[] nums = {0, 4};
        int k = 5;
        Solution solution = new Solution();
        int ans = solution.maximumProduct(nums, k);
        System.out.println(ans);

    }
}