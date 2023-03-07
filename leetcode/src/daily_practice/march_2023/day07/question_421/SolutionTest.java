package daily_practice.march_2023.day07.question_421;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMaximumXOR() {

        int[] nums = new int[]{3,10,5,25,2,8};
        Solution solution = new Solution();
        int ans = solution.findMaximumXOR(nums);
        System.out.println(ans);

    }
}