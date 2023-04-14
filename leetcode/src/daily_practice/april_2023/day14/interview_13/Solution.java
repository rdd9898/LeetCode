package daily_practice.april_2023.day14.interview_13;

/**
 * @program: LeetCode
 * @description: 面试题13. 机器人的运动范围
 * @author: Mr.Hu
 * @create: 2023-04-13 22:37
 **/
public class Solution {

    int[][] steps = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int ans = 0;

    public int movingCount(int m, int n, int k) {
        boolean[][] flag = new boolean[m][n];
        dfs(0, 0, m, n, k, flag);
        return ans;
    }

    private void dfs(int x, int y, int m, int n, int k, boolean[][] flag) {
        if (x < 0 || x >= m || y < 0 || y >= n || flag[x][y] || !pd(x, y, k)) return;
        flag[x][y] = true;
        ans++;
        for (int[] step : steps) {
            dfs(x + step[0], y + step[1], m, n, k, flag);
        }
    }

    public boolean pd(int x, int y, int k) {
        String s1 = Integer.toString(x);
        String s2 = Integer.toString(y);
        int ans = 0;
        for (int i = 0; i < s1.length(); i++) {
            ans += s1.charAt(i) - '0';
        }
        for (int j = 0; j < s2.length(); j++) {
            ans += s2.charAt(j) - '0';
        }
        return ans <= k;
    }

}
