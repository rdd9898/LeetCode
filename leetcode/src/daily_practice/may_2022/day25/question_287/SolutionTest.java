package daily_practice.may_2022.day25.question_287;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findDuplicate() {

        int[] nums = {1,3,4,2,2};
        Solution solution = new Solution();
        int ans = solution.findDuplicate(nums);
        System.out.println(ans);

    }
}