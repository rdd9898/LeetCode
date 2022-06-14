package daily_practice.june_2022.day14.question_498;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 498.对角线遍历
 * @date 2022年06月14日 9:04
 */
public class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int x = 0, y = 0;
        int[] ans = new int[m * n];
        boolean flag = true;
        for (int i = 0; i < m * n; i++) {
            ans[i] = mat[x][y];
            if (flag) {
                x--;
                y++;
                if (x < 0 && y == n) {
                    x = 1;
                    y = n - 1;
                    flag = !flag;
                } else if (x < 0) {
                    x = 0;
                    flag = !flag;
                } else if (y == n) {
                    y--;
                    x += 2;
                    flag = !flag;
                }

            } else {
                x++;
                y--;
                if (y < 0 && x == m) {
                    x = m - 1;
                    y = 1;
                    flag = !flag;
                } else if (y < 0) {
                    y = 0;
                    flag = !flag;
                } else if (x == m) {
                    x--;
                    y = y + 2;
                    flag = !flag;
                }
            }
        }
        return ans;
    }

}
