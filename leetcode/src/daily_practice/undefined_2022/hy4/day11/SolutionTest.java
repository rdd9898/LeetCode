package daily_practice.undefined_2022.hy4.day11;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void smallestRangeI() {

        int[] nums = {0, 10};
        int k = 2;
        Solution solution = new Solution();
        int ans = solution.smallestRangeI(nums, k);
        System.out.println(ans);

    }
}