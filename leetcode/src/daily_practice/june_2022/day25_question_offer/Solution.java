package daily_practice.june_2022.day25_question_offer;

import java.util.Arrays;

/**
 * 使用的动态规划，目前还没学动态规划，CV
 * @program: LeetCode
 * @description: OfferⅡ 091.粉刷房子
 * @author: Mr.Hu
 * @create: 2022-06-25 11:23
 **/
public class Solution {

    public int minCost(int[][] costs) {
        int n = costs.length;
        int[] dp = new int[3];
        for (int j = 0; j < 3; j++) {
            dp[j] = costs[0][j];
        }
        for (int i = 1; i < n; i++) {
            int[] dpNew = new int[3];
            for (int j = 0; j < 3; j++) {
                dpNew[j] = Math.min(dp[(j + 1) % 3], dp[(j + 2) % 3]) + costs[i][j];
            }
            dp = dpNew;
        }
        return Arrays.stream(dp).min().getAsInt();
    }

}
