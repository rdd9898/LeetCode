package daily_practice.april_2023.day11.offer_04;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 04. 二维数组中的查找
 * @author: Mr.Hu
 * @create: 2023-04-11 22:11
 **/
public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][n - 1]) {
                int left = 0;
                int right = n;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (matrix[i][mid] < target) left = mid + 1;
                    else if (matrix[i][mid] > target) right = mid - 1;
                    else return true;
                }
                if (matrix[i][left] == target) return true;
            }
        }
        return false;
    }

}
