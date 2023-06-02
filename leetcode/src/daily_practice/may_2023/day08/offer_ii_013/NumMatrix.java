package daily_practice.may_2023.day08.offer_ii_013;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 013. 二维子矩阵的和
 * @author: Mr.Hu
 * @create: 2023-05-08 15:50
 **/
public class NumMatrix {

    int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        this.sumMatrix = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sumMatrix[i][j] = matrix[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= m; i++) {
            sumMatrix[i][1] += sumMatrix[i - 1][1];
        }
        for (int i = 1; i <= n; i++) {
            sumMatrix[1][i] += sumMatrix[1][i - 1];
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                sumMatrix[i][j] += sumMatrix[i - 1][j] + sumMatrix[i][j - 1] - sumMatrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row1][col2 + 1] - sumMatrix[row2 + 1][col1] + sumMatrix[row1][col1];
    }

}
