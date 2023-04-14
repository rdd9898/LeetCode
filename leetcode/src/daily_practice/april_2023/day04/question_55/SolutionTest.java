package daily_practice.april_2023.day04.question_55;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void canJump() {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 0, 4};
        boolean ans = solution.canJump(nums);
        System.out.println(ans);
    }
}