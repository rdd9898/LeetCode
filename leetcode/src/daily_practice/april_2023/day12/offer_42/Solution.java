package daily_practice.april_2023.day12.offer_42;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 42. 连续子数组的最大和
 * @author: Mr.Hu
 * @create: 2023-04-12 20:08
 **/
public class Solution {

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) dp[i] = nums[i];
            else dp[i] = nums[i] + dp[i - 1];
            if (dp[i] > ans) ans = dp[i];
        }
        return ans;
    }

}
