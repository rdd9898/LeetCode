package daily_practice.april_2023.day21.offer_56_ii;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void singleNumber() {

        int[] nums = {3, 4, 3, 3};
        Solution solution = new Solution();
        int ans = solution.singleNumber(nums);
        System.out.println(ans);

    }
}