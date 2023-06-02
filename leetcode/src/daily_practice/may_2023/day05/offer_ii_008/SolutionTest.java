package daily_practice.may_2023.day05.offer_ii_008;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        Solution solution = new Solution();
        int ans = solution.minSubArrayLen(target, nums);
        System.out.println(ans);
    }
}