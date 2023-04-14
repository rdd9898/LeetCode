package daily_practice.april_2023.day12.offer_10_ii;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 10- II. 青蛙跳台阶问题
 * @author: Mr.Hu
 * @create: 2023-04-12 19:46
 **/
public class Solution {

    int MOD = 1000000007;

    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return dp[n - 1];
    }

}
