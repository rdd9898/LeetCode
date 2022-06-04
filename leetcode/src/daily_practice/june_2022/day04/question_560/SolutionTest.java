package daily_practice.june_2022.day04.question_560;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subarraySum() {

        int[] nums = {1, -1, 0};
        int k = 0;
        Solution solution = new Solution();
        int ans = solution.subarraySum(nums, k);
        System.out.println(ans);

    }
}