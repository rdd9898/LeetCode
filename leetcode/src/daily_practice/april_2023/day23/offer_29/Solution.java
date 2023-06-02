package daily_practice.april_2023.day23.offer_29;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 29. 顺时针打印矩阵
 * @author: Mr.Hu
 * @create: 2023-04-23 21:47
 **/
public class Solution {

    int[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[matrix.length];
        int n = matrix[0].length;
        int index = 0;
        int edge = 0;
        int[] ans = new int[m * n];
        int x = 0, y = 0;
        for (int i = 0; i < m * n - 1; i++) {
            ans[i] = matrix[x][y];
            if (matrix[x][y] == 4) {
                int s = 1;
            }
            while (x + steps[index][0] < edge || x + steps[index][0] >= m - edge || y + steps[index][1] < edge || y + steps[index][1] >= n - edge) {
                index++;
                if (index == 4) index = 0;
            }
            x += steps[index][0];
            y += steps[index][1];
            if (index == 3 && x == edge + 1 && y == edge) {
                edge++;
            }
        }
        ans[m * n - 1] = matrix[x][y];
        return ans;
    }

}
