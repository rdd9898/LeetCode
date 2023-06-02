package daily_practice.april_2023.day26.offer_19;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 19. 正则表达式匹配
 * @author: Mr.Hu
 * @create: 2023-04-26 11:04
 **/
public class Solution {

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < p.length(); i = i + 2) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '*') {
                    if (dp[i][j - 2]) dp[i][j] = true;
                    else if (dp[i - 1][j] && p.charAt(j - 2) == s.charAt(i - 1)) dp[i][j] = true;
                    else if (dp[i - 1][j] && p.charAt(j - 2) == '.') dp[i][j] = true;
                } else {
                    if (dp[i - 1][j - 1] && p.charAt(j - 1) == s.charAt(i - 1)) dp[i][j] = true;
                    else if (dp[i - 1][j - 1] && p.charAt(j - 1) == '.') dp[i][j] = true;
                }
            }
        }
        return dp[s.length()][p.length()];
    }

}
