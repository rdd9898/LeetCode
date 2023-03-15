package daily_practice.march_2023.day14.question_695;

/**
 * @program: LeetCode
 * @description: 695.岛屿的最大面积
 * @author: Mr.Hu
 * @create: 2023-03-14 20:06
 **/
public class Solution {

    private int m;
    private int n;
    private int[][] steps = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    private int tempAns = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        m = grid.length;
        n = grid[0].length;
        boolean[][] flag = new boolean[m][n];
        for (int i = 0; i < m * n; i++) {
            int x = i / n;
            int y = i % n;
            if (grid[x][y] == 0 || flag[x][y]) continue;
            tempAns = 0;
            dfs(x, y, grid, flag);
            ans = Integer.max(ans, tempAns);
        }
        return ans;
    }

    public void dfs(int x, int y, int[][] grid, boolean[][] flag) {
        flag[x][y] = true;
        tempAns++;
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n || grid[x + step[0]][y + step[1]] == 0 || flag[x + step[0]][y + step[1]]) continue;
            dfs(x + step[0], y + step[1], grid, flag);
        }
    }

}
