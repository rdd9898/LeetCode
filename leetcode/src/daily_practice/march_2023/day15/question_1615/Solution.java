package daily_practice.march_2023.day15.question_1615;

/**
 * @program: LeetCode
 * @description: 1615.最大网络秩
 * @author: Mr.Hu
 * @create: 2023-03-15 21:44
 **/
public class Solution {

    public int maximalNetworkRank(int n, int[][] roads) {
        int ans = 0;
        int[] cities = new int[n];
        int[][] flag = new int[n][n];
        for (int[] road : roads) {
            flag[road[0]][road[1]] = -1;
            flag[road[1]][road[0]] = -1;
            cities[road[0]]++;
            cities[road[1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                flag[i][j] += cities[i];
                flag[i][j] += cities[j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = Integer.max(ans, flag[i][j]);
            }
        }
        return ans;
    }

}
