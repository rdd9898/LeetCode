package daily_practice.march_2023.day14.question_1605;

/**
 * @program: LeetCode
 * @description: 1605.给定行和列的和求可行矩阵
 * @author: Mr.Hu
 * @create: 2023-03-14 11:04
 **/
public class Solution {

    /**
    * @Description: 通过贪心算法解决该问题
    * @Param: [rowSum, colSum]
    * @return: int[][]
    * @Author: HuYang
    * @Date: 2023/3/14
    */
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];
        for (int x = 0; x < m * n; x++) {
            int i = x / n;
            int j = x % n;
            int value = Integer.min(rowSum[i], colSum[j]);
            if (value == 0) continue;
            matrix[i][j] = value;
            rowSum[i] -= value;
            colSum[j] -= value;
        }
        return matrix;
    }

}
