package daily_practice.march_2023.day01.question_2373;

/**
 * @program: LeetCode
 * @description: 2373.矩阵中的局部最大值
 * @author: Mr.Hu
 * @create: 2023-03-01 21:24
 **/
public class Solution {

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int max = n - 2;
        int[][] maxLocal = new int[max][max];
        int x = 1;
        int y = 1;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                maxLocal[i][j] = calculateMax(x, y, grid);
                y++;
                if (y > max) {
                    x++;
                    y = 1;
                }
            }
        }
        return maxLocal;
    }

    public int calculateMax(int x, int y, int[][] grid) {
        int max = Integer.max(grid[x - 1][y - 1], grid[x - 1][y]);
        max = Integer.max(max, grid[x - 1][y + 1]);
        max = Integer.max(max, grid[x][y - 1]);
        max = Integer.max(max, grid[x][y]);
        max = Integer.max(max, grid[x][y + 1]);
        max = Integer.max(max, grid[x + 1][y - 1]);
        max = Integer.max(max, grid[x + 1][y]);
        max = Integer.max(max, grid[x + 1][y + 1]);
        return max;
    }

}
