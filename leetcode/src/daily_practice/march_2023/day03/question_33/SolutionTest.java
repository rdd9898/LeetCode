package daily_practice.march_2023.day03.question_33;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void search() {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 1};
        int target = 1;
        int ans = solution.search(nums, target);
        System.out.println(ans);
    }
}