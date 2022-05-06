package daily_practice.undefined_2022.hy3.day13;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/5 9:32
 * @description：回溯算法加深度优先遍历
 * @modified By：
 * @version: $1219.黄金矿工
 */
public class Solution {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] grid;
    int m, n;
    int ans = 0;

    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 深度优先遍历
                if (grid[i][j] != 0) {
                    dfs(i, j, 0);
                }
            }
        }
        return ans;
    }

    private void dfs(int x, int y, int gold) {
        // 挖黄金，并找到当前所挖最大的值
        gold += grid[x][y];
        ans = Math.max(gold, ans);
        // 已经挖过的位置设置为0，记录准备回溯
        int res = grid[x][y];
        grid[x][y] = 0;

        for (int d = 0; d < 4; d++) {
            int nx = x + grid[d][0];
            int ny = y + grid[d][1];
            if (nx > 0 && nx < m && ny > 0 && ny < n) {
                dfs(nx, ny, gold);
            }
        }
        // 回溯
        grid[x][y] = res;
    }
}
