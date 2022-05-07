package daily_practice.may_2022.day07.question_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void twoSum() {
        int[] nums = {0,3,-3,4,-1};
        int target = -1;
        Solution solution = new Solution();
        int[] answer = solution.twoSum(nums, target);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}