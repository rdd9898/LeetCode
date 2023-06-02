package daily_practice.april_2023.day20.offer_ii_010;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subarraySum() {
        int[] nums = {1, 1, 1};
        int k = 2;
        Solution solution = new Solution();
        int ans = solution.subarraySum(nums, k);
        System.out.println(ans);
    }
}