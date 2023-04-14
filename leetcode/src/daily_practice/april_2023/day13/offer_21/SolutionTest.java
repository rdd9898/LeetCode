package daily_practice.april_2023.day13.offer_21;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void exchange() {
        int[] nums = {1,3,5};
        Solution solution = new Solution();
        int[] ints = solution.exchange(nums);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}