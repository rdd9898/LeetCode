package daily_practice.may_2023.day06.offer_ii_010;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subarraySum() {
        int[] nums = {3, 2, 1};
        int k = 3;
        Solution solution = new Solution();
        int ans = solution.subarraySum(nums, k);
        System.out.println(ans);
    }
}