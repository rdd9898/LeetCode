package daily_practice.april_2023.day12.offer_63;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 63. 股票的最大利润
 * @author: Mr.Hu
 * @create: 2023-04-12 19:59
 **/
public class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Integer.max(dp[i - 1], prices[i] - min);
            if (prices[i] < min) min = prices[i];
        }
        return dp[prices.length - 1];
    }

}
