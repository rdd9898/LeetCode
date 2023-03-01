package daily_practice.feb_2023.day20.question_2553;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void separateDigits() {
        int[] nums = {100,32,43,68,8,100,84,80,14,88,42,53,98,69,64,40,60,23,99};
        Solution solution = new Solution();
        int[] ans = solution.separateDigits(nums);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}