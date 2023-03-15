package daily_practice.march_2023.day14.question_200;

/**
 * @program: LeetCode
 * @description: 200.岛屿数量
 * @author: Mr.Hu
 * @create: 2023-03-14 21:03
 **/
public class Solution {
    

    private int[][] steps = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int m;
    private int n;

    /**
    * @Description: 通过 DFS 解决该问题
    * @Param: [grid]
    * @return: int
    * @Author: HuYang
    * @Date: 2023/3/14
    */
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean[][] flag = new boolean[m][n];
        int ans = 0;
        for (int x = 0; x < m * n; x++) {
            int i = x / n;
            int j = x % n;
            if (grid[i][j] == '0' || flag[i][j]) continue;
            dfs(i, j, grid, flag);
            ans++;
        }
        return ans;
    }

    private void dfs(int x, int y, char[][] grid, boolean[][] flag) {
        flag[x][y] = true;
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n || grid[x + step[0]][y + step[1]] == '0' || flag[x + step[0]][y + step[1]]) continue;
            dfs(x + step[0], y + step[1], grid, flag);
        }
    }

}
