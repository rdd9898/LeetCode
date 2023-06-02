package daily_practice.april_2023.day25.offer_59_i;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void maxSlidingWindow() {
        Solution2 solution2 = new Solution2();
        int[] nums = {100,3,4,5,6,7};
        int k = 3;
        int[] ans = solution2.maxSlidingWindow(nums, k);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}