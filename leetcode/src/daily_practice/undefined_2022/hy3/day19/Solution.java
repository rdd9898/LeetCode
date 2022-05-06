package daily_practice.undefined_2022.hy3.day19;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/12 11:07
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static int numEnclaves(int[][] grid) {
        int ans = 0;
        int[][] flag = new int[grid.length][grid[0].length];
        // 将处于边缘位置的陆地标签设为1
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if ((j == 0 || i == 0 || j == grid[0].length - 1 || i == grid.length - 1) && grid[i][j] == 1) {
                    dfs(i, j, flag, grid);
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (flag[i][j] == 0 && grid[i][j] == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void dfs(int row, int col, int[][] flag, int[][] grid) {

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || flag[row][col] == 1 || grid[row][col] == 0) {
            return;
        }

        flag[row][col] = 1;

        for (int[] dir : dirs) {
            dfs(row + dir[0], col + dir[1], flag, grid);
        }
    }
}
