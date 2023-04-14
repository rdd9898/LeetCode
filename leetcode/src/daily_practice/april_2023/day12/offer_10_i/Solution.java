package daily_practice.april_2023.day12.offer_10_i;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 10- I. 斐波那契数列
 * @author: Mr.Hu
 * @create: 2023-04-12 19:41
 **/
public class Solution {

    int MOD = 1000000007;

    public int fib(int n) {
        if (n < 2) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return dp[n];
    }

}
