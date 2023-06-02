package daily_practice.april_2023.day20.offer_56_i;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void singleNumbers() {

        int[] nums = {4, 1, 4, 6};
        Solution solution = new Solution();
        int[] ans = solution.singleNumbers(nums);
        for (int an : ans) {
            System.out.println(an);
        }

    }
}