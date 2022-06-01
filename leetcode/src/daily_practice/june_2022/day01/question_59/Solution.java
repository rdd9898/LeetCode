package daily_practice.june_2022.day01.question_59;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 59.螺旋矩阵Ⅱ
 * @date 2022年06月01日 9:58
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int x = 1;
        int i = 0;
        int j = 0;
        int record = 0;
        boolean[][] flags = new boolean[n][n];
        for(int z = 0; z < n * n; z++, x++) {

            ans[i][j] = x;
            flags[i][j] = true;
            if (record == 1 && j + 1 < n && !flags[i][j + 1]) {
                j++;
            } else if (record == 2 && i + 1 < n && !flags[i +1][j]) {
                i++;
            } else if (record == 3 && j - 1 >= 0 && !flags[i][j - 1]) {
                j--;
            } else if (record == 4 && i - 1 >= 0 && !flags[i - 1][j]) {
                i--;
            } else {
                if (j + 1 < n && !flags[i][j + 1]) {
                    j++;
                    record = 1;
                } else if (i + 1 < n && !flags[i +1][j]) {
                    i++;
                    record = 2;
                } else if (j - 1 >= 0 && !flags[i][j - 1]) {
                    j--;
                    record = 3;
                } else if (i - 1 >= 0 && !flags[i - 1][j]) {
                    i--;
                    record = 4;
                }
            }
        }
        return ans;
    }

}
