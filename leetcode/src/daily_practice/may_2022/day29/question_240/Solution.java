package daily_practice.may_2022.day29.question_240;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 240.搜索二维矩阵Ⅱ
 * @date 2022年05月29日 10:41
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] > target) {
                    right = mid - 1;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

}
