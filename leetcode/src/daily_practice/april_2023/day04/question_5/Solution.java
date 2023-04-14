package daily_practice.april_2023.day04.question_5;

/**
 * @program: LeetCode
 * @description: 5.最长回文子串
 * @author: Mr.Hu
 * @create: 2023-04-04 20:39
 **/
public class Solution {

    public String longestPalindrome(String s) {
        int length = s.length();
        int maxL = 1;
        int begin = 0;
        boolean[][] dp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            dp[i][i] = true;
        }
        for (int L = 2; L <= length; L++) {
            for (int i = 0; i < length; i++) {
                int j = L + i - 1;
                if (j >= length) {
                    break;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) dp[i][j] = true;
                    else dp[i][j] = dp[i + 1][j - 1];
                }
                if (dp[i][j] && j - i + 1 > maxL) {
                    maxL = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxL);
    }

}
