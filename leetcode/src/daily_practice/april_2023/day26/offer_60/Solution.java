package daily_practice.april_2023.day26.offer_60;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 60. n个骰子的点数
 * @author: Mr.Hu
 * @create: 2023-04-26 20:53
 **/
public class Solution {

    public double[] dicesProbability(int n) {
        double[] dp = new double[n * 6 + 1];
        for (int i = 1; i <= 6; i++) {
            dp[i] = 1.0 / 6;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i * 6; j >= i; j--) {
                dp[j] = 0;
                for (int k = 1; k <= 6; k++) {
                    if (j - k >= i - 1 && j - k <= (i - 1) * 6) {
                        dp[j] += dp[j - k] * (1.0 / 6);
                    }
                }
            }
        }
        return Arrays.copyOfRange(dp, n, n * 6 + 1);
    }

}
