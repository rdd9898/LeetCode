package daily_practice.april_2023.day17.offer_61;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isStraight() {
        int[] nums = {0, 0, 8, 5, 4};
        Solution solution = new Solution();
        boolean ans = solution.isStraight(nums);
        System.out.println(ans);
    }
}