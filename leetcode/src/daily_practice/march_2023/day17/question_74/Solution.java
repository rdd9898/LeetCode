package daily_practice.march_2023.day17.question_74;

/**
 * @program: LeetCode
 * @description: 74.搜索二维矩阵
 * @author: Mr.Hu
 * @create: 2023-03-17 16:49
 **/
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean flag = false;
        int left = 0;
        int right = m;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] < target) left = mid + 1;
            else  right = mid;
        }
        if (right != m && matrix[right][0] == target) return true;
        if (right == 0) return false;
        int row = right - 1;
        left = 0;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] < target) left = mid + 1;
            else if (matrix[row][mid] > target) right = mid - 1;
            else return true;
        }
        return flag;
    }

}
