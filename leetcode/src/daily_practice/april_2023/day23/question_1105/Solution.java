package daily_practice.april_2023.day23.question_1105;

/**
 * @program: LeetCode
 * @description: 1105. 填充书架
 * @author: Mr.Hu
 * @create: 2023-04-23 16:53
 **/
public class Solution {

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[] dp = new int[books.length + 1];
        dp[0] = 0;
        for (int i = 0; i < books.length; i++) {
            int length = books[i][0];
            int height = books[i][1];
            int min = dp[i] + height;
            for (int j = i - 1; j >= 0; j--) {
                length += books[j][0];
                height = Integer.max(height, books[j][1]);
                if (length <= shelfWidth) {
                    min = Integer.min(min, dp[j] + height);
                }
            }
            dp[i + 1] = min;
        }
        return dp[books.length];
    }

}
