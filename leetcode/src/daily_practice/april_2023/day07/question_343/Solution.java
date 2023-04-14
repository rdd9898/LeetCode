package daily_practice.april_2023.day07.question_343;

/**
 * @program: LeetCode
 * @description: 343.整数拆分
 * @author: Mr.Hu
 * @create: 2023-04-07 14:50
 **/
public class Solution {

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i - 1; j >= 2; j--) {
                max = Integer.max(max, j * dp[i - j]);
                max = Integer.max(max, j * (i - j));
            }
            dp[i] = max;
        }
        return dp[n];
    }

}
