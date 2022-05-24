package daily_practice.may_2022.day24.question_611;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void triangleNumber() {

        int[] nums = {2,2,3,4};
        Solution solution = new Solution();
        int ans = solution.triangleNumber(nums);
        System.out.println(ans);

    }
}