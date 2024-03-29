package daily_practice.april_2023.day26.offer_49;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 49. 丑数
 * @author: Mr.Hu
 * @create: 2023-04-26 20:45
 **/
public class Solution {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;
        }
        return dp[n - 1];
    }

}
