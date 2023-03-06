package daily_practice.march_2023.day02.question_414;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void thirdMax() {

        Solution solution = new Solution();
        int[] nums = {1,2,-2147483648};
        int ans = solution.thirdMax(nums);
        System.out.println(ans);

    }
}