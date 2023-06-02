package daily_practice.may_2023.day05.offer_ii_004;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void singleNumber() {
        int[] nums = {2, 2, 2, 3};
        Solution solution = new Solution();
        int i = solution.singleNumber(nums);
        System.out.println(i);
    }
}