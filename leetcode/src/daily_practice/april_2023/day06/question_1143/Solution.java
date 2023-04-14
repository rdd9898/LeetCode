package daily_practice.april_2023.day06.question_1143;

/**
 * @program: LeetCode
 * @description: 1143.最长公共子序列
 * @author: Mr.Hu
 * @create: 2023-04-06 17:19
 **/
public class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            if (flag) dp[i][0] = 1;
            if (text1.charAt(i) == text2.charAt(0)) {
                dp[i][0] = 1;
                flag = true;
            }
        }
        flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) dp[0][i] = 1;
            if (text2.charAt(i) == text1.charAt(0)) {
                dp[0][i] = 1;
                flag = true;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m - 1][n - 1];
    }

}
