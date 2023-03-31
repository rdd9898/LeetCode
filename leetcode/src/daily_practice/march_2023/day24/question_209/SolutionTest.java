package daily_practice.march_2023.day24.question_209;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minSubArrayLen() {
        Solution solution = new Solution();
        int target = 15;
        int[] nums = {1, 2, 3, 4, 5};
        int ans = solution.minSubArrayLen(target, nums);
        System.out.println(ans);
    }
}