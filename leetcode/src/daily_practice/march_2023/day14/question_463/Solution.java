package daily_practice.march_2023.day14.question_463;

/**
 * @program: LeetCode
 * @description: 463.岛屿的周长
 * @author: Mr.Hu
 * @create: 2023-03-14 21:31
 **/
public class Solution {

    int[][] steps = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m;
    int n;
    int ans = 0;

    public int islandPerimeter(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        boolean[][] flag = new boolean[m][n];
        for (int i = 0; i < m * n; i++) {
            int x = i / n;
            int y = i % n;
            if (grid[x][y] == 0) continue;
            dfs(x, y, grid, flag);
            break;
        }
        return ans;
    }

    private void dfs(int x, int y, int[][] grid, boolean[][] flag) {
        flag[x][y] = true;
        int temp = 0;
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n || grid[x + step[0]][y + step[1]] == 0) continue;
            temp++;
        }
        ans += 4 - temp;
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n || grid[x + step[0]][y + step[1]] == 0 || flag[x + step[0]][y + step[1]]) continue;
            dfs(x + step[0], y + step[1], grid, flag);
        }
    }

}
