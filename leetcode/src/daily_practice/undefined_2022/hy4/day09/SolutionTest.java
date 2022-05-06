package daily_practice.undefined_2022.hy4.day09;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void sortArrayByParity() {

        int[] nums = {3,1,2,4};
        Solution solution = new Solution();
        int[] answers = solution.sortArrayByParity(nums);
        for (int answer : answers) {
            System.out.println(answer);
        }

    }
}