package daily_practice.april_2023.day03.question_198;

/**
 * @program: LeetCode
 * @description: 198.打家劫舍
 * @author: Mr.Hu
 * @create: 2023-04-03 22:07
 **/
public class Solution {

    public int rob(int[] nums) {

        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Integer.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
        }

        return dp[nums.length];

    }

}
