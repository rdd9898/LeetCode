package daily_practice.april_2023.day05.question_673;

/**
 * @program: LeetCode
 * @description: 673.最长递增子序列的个数
 * @author: Mr.Hu
 * @create: 2023-04-05 16:45
 **/
public class Solution {

    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        int[] dp2 = new int[length];
        int maxLen = 0;
        int ans = 0;
        for (int i = 0; i < length; i++) {
            dp[i] = 1;
            dp2[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[i] <= dp[j]) {
                        dp[i] = dp[j] + 1;
                        dp2[i] = dp2[j];
                    } else if (dp[i] == dp[j] + 1) dp2[i] += dp2[j];
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                ans = dp2[i];
            } else if (dp[i] == maxLen) {
                ans += dp2[i];
            }
        }
        return ans;
    }

}


