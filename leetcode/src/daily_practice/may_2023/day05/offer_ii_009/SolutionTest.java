package daily_practice.may_2023.day05.offer_ii_009;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numSubarrayProductLessThanK() {
        int[] nums = {1, 2, 3};
        int k = 0;
        Solution solution = new Solution();
        int ans = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println(ans);
    }
}