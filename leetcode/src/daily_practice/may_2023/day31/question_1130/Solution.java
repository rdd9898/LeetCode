package daily_practice.may_2023.day31.question_1130;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 1130. 叶值的最小代价生成树
 * @author: Mr.Hu
 * @create: 2023-05-31 20:24
 **/
public class Solution {

    public int mctFromLeafValues(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 4);
        }
        int[][] mval = new int[n][n];
        for (int j = 0; j < n; j++) {
            dp[j][j] = 0;
            mval[j][j] = arr[j];
            for (int i = j - 1; i >= 0; i++) {
                mval[i][j] = Math.max(arr[i], mval[i + 1][j]);
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + mval[i][k] * mval[k + 1][j]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
