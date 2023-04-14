package daily_practice.april_2023.day05.question_300;

/**
 * @program: LeetCode
 * @description: 300.最长递增子序列
 * @author: Mr.Hu
 * @create: 2023-04-05 15:45
 **/
public class Solution {

    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = 1;
        for (int i = 1; i < length; i++) {
            int temp = nums[i];
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < temp) {
                    if (dp[i] <= dp[j]) dp[i] = dp[j] + 1;
                }
            }
        }
        int ans = 1;
        for (int i = 0; i < length; i++) {
            if (ans < dp[i]) ans = dp[i];
        }
        return ans;
    }

}
