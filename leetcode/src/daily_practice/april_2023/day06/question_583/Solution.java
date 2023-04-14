package daily_practice.april_2023.day06.question_583;

/**
 * @program: LeetCode
 * @description: 583.两个字符串的删除操作
 * @author: Mr.Hu
 * @create: 2023-04-06 20:39
 **/
public class Solution {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] bp = new int[m + 1][n + 1];
        bp[0][0] = 0;
        for (int i = 1; i <= m; i++) {
            bp[i][0] = i;
        }
        for (int i = 1; i <= n; i++) {
            bp[0][i] = i;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) bp[i][j] = bp[i - 1][j - 1];
                else bp[i][j] = Integer.min(bp[i - 1][j], bp[i][j - 1]) + 1;;
            }
        }
        return bp[m][n];
    }

}
