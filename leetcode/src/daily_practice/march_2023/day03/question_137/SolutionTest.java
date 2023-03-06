package daily_practice.march_2023.day03.question_137;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void singleNumber() {
        Solution solution = new Solution();
        int[] nums = {2, 2, 2, 3};
        int ans = solution.singleNumber(nums);
        System.out.println(ans);
    }
}