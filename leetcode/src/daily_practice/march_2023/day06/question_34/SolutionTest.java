package daily_practice.march_2023.day06.question_34;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchRange() {
        Solution solution = new Solution();
        int[] nums = {5,7,7,8,8,10};
        int target = 41;
        int[] ans = solution.searchRange(nums, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}