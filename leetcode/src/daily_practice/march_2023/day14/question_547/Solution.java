package daily_practice.march_2023.day14.question_547;

/**
 * @program: LeetCode
 * @description: 547.省份数量
 * @author: Mr.Hu
 * @create: 2023-03-14 21:52
 **/
public class Solution {

    int m;

    public int findCircleNum(int[][] isConnected) {
        int ans = 0;
        m = isConnected.length;
        boolean[] flag = new boolean[m];
        for (int i = 0; i < m; i++) {
            if (flag[i]) continue;
            dfs(i, isConnected, flag);
            ans++;
        }
        return ans;
    }

    private void dfs(int x, int[][] isConnected, boolean[] flag) {
        flag[x] = true;
        for (int i = 0; i < m; i++) {
            if (flag[i] || isConnected[x][i] == 0 || x == i) continue;
            dfs(i, isConnected, flag);
        }
    }

}
