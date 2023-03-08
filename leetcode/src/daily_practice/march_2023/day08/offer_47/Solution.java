package daily_practice.march_2023.day08.offer_47;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 47.礼物的最大价值
 * @author: Mr.Hu
 * @create: 2023-03-08 10:16
 * @method: 使用深度优先算法
 **/
public class Solution {

    private int[][] step = {{0, 1}, {1, 0}};
    private int m;
    private int n;
    public int maxValue(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][] flag = new int[m][n];
        int ans = dfs(0, 0, grid, flag);
        return ans;

    }

    public int dfs(int x, int y, int[][] grid, int[][] flag) {
        if (x >= m || y >= n) return 0;
        if (x == m - 1 && y == n - 1) {
            flag[x][y] = grid[x][y];
            return grid[x][y];
        }
        if (flag[x][y] != 0) return flag[x][y];
        int res = Integer.max(dfs(x + step[0][0], y + step[0][1], grid, flag) + grid[x][y],
                dfs(x + step[1][0], y + step[1][1], grid, flag) + grid[x][y]);
        flag[x][y] = res;
        return res;
    }

}
