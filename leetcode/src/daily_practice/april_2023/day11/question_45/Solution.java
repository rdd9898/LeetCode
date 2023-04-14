package daily_practice.april_2023.day11.question_45;

/**
 * @program: LeetCode
 * @description: 45.跳跃游戏 II
 * @author: Mr.Hu
 * @create: 2023-04-11 12:16
 **/
public class Solution {

    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] >= i)
            dp[i] = Integer.max(dp[i - 1], i + nums[i]);
        }
        int ans = 0;
        int cur = 0;
        while (dp[cur] < nums.length - 1) {
            ans++;
            cur = dp[cur];
        }
        ans++;
        return ans;
    }

}
