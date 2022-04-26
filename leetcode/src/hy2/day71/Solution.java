package hy2.day71;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 883.三维形体投影面积
 * @date 2022年04月26日 9:45
 */
public class Solution {

    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < n; i++) {
            int max1 = 0;
            int max2 = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    sum1++;
                }
                if (grid[i][j] > max1) {
                    max1 = grid[i][j];
                }
                if (grid[j][i] > max2) {
                    max2 = grid[j][i];
                }
            }
            sum2 += max1;
            sum3 += max2;
        }

        return sum1 + sum2 + sum3;
    }

}
