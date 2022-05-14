package daily_practice.may_2022.day14.question_153;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMin() {

        int[] nums = {3,4,5,1,2};
        Solution solution = new Solution();
        int ans = solution.findMin(nums);
        System.out.println(ans);

    }
}