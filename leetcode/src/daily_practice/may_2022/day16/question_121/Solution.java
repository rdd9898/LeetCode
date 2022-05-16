package daily_practice.may_2022.day16.question_121;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 121.买卖股票的最佳时机
 * @date 2022年05月16日 9:33
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > ans) {
                ans = prices[i] - min;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return ans;
    }

}
