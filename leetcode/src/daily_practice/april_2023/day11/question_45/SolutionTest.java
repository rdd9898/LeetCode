package daily_practice.april_2023.day11.question_45;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void jump() {

        Solution solution = new Solution();
        int[] nums = {2, 1};
        int ans = solution.jump(nums);
        System.out.println(ans);

    }
}