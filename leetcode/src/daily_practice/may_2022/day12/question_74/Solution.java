package daily_practice.may_2022.day12.question_74;

/**
 * @program: LeetCode
 * @description: 74.搜索二维矩阵
 * @author: Mr.Hu
 * @create: 2022-05-12 11:09
 **/
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / n][mid % n] > target) {
                right = mid - 1;
            } else if (matrix[mid / n][mid % n] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
