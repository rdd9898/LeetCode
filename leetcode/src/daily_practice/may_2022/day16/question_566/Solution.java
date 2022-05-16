package daily_practice.may_2022.day16.question_566;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 566.重塑矩阵
 * @date 2022年05月16日 9:43
 */
public class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = mat[x][y];
                y++;
                if (y == n) {
                    y = 0;
                    x++;
                }
            }
        }
        return ans;
    }

}
