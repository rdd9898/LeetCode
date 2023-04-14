package daily_practice.april_2023.day06.question_322;

/**
 * @program: LeetCode
 * @description: 322.零钱兑换
 * @author: Mr.Hu
 * @create: 2023-04-06 21:40
 **/
public class Solution {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            int temp = Integer.MAX_VALUE;
            boolean flag = false;
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] >= 0) {
                    temp = Integer.min(temp, dp[i - coin]);
                    flag = true;
                }
            }
            if (!flag) dp[i] = -1;
            else dp[i] = temp + 1;
        }
        return dp[amount];
    }

}
