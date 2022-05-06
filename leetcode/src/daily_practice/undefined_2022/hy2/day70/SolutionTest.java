package daily_practice.undefined_2022.hy2.day70;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test() {
        int[] nums = new int[] {1, 2, 3, 3, 3};
        Solution solution = new Solution(nums);
        int pick = solution.pick(3);
        int pick1 = solution.pick(1);
        System.out.println(pick);
        System.out.println(pick1);
    }

}