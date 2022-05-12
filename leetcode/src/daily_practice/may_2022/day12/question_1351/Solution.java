package daily_practice.may_2022.day12.question_1351;

/**
 * @program: LeetCode
 * @description: 1351.统计有序矩阵中的负数
 * @author: Mr.Hu
 * @create: 2022-05-12 11:02
 **/
public class Solution {

    public int countNegatives(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (grid[i][mid] > 0) {
                    left = mid + 1;
                } else if (grid[i][mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            ans += n - left;
        }
        return ans;
    }

}
