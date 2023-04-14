package daily_practice.april_2023.day05.question_673;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findNumberOfLIS() {

        int[] nums = {1, 3, 5, 4, 7};
        Solution solution = new Solution();
        int ans = solution.findNumberOfLIS(nums);
        System.out.println(ans);

    }
}