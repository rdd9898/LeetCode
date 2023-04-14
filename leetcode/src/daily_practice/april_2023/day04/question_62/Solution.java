package daily_practice.april_2023.day04.question_62;

/**
 * @program: LeetCode
 * @description: 62.不同路径
 * @author: Mr.Hu
 * @create: 2023-04-04 17:07
 **/
public class Solution {

    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        int ans = dfs(m - 1, n - 1);
        return ans;
    }

    private int dfs(int m, int n) {
        if (m == 0 || n == 0) {
            dp[m][n] = 1;
            return 1;
        }
        int a = 0;
        int b = 0;
        if (dp[m - 1][n] == 0) {
            a = dfs(m - 1, n);
            dp[m - 1][n] = a;
        } else {
            a = dp[m - 1][n];
        }
        if (dp[m][n - 1] == 0) {
            b = dfs(m, n - 1);
            dp[m][n - 1] = b;
        } else {
            b = dp[m][n - 1];
        }
        return a + b;
    }

}
