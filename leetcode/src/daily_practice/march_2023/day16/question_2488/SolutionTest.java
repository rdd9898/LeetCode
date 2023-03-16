package daily_practice.march_2023.day16.question_2488;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void countSubarrays() {

        int[] nums = {5,19,11,15,13,16,4,6,2,7,10,8,18,20,1,3,17,9,12,14};
        int k = 6;
        Solution solution = new Solution();
        int ans = solution.countSubarrays(nums, k);
        System.out.println(ans);

    }
}