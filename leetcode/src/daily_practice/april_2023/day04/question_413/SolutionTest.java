package daily_practice.april_2023.day04.question_413;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void numberOfArithmeticSlices() {
        int[] nums = {1, 2, 3, 8, 9, 10};
        Solution solution = new Solution();
        int ans = solution.numberOfArithmeticSlices(nums);
        System.out.println(ans);
    }
}