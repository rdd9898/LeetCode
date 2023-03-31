package daily_practice.march_2023.day23.question_1630;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void checkArithmeticSubarrays() {

        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};
        Solution solution = new Solution();
        List<Boolean> ans = solution.checkArithmeticSubarrays(nums, l, r);
        System.out.println(ans);

    }
}