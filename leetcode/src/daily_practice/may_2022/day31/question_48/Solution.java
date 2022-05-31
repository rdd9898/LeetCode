package daily_practice.may_2022.day31.question_48;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 48.旋转图像
 * @date 2022年05月31日 10:40
 */
public class Solution {

    public void rotate(int[][] matrix) {
        boolean[][] flags = new boolean[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (!flags[i][j]) {
                    int x = i;
                    int y = j;
                    int tmp = matrix[x][y];
                    for(int k = 0; k < 4; k++) {
                        flags[y][matrix.length - 1 - x] = true;
                        int tmp3 = matrix[y][matrix.length - 1 - x];
                        matrix[y][matrix.length - 1 - x] = tmp;
                        tmp = tmp3;
                        int tmp2 = matrix.length - 1 - x;
                        x = y;
                        y = tmp2;
                    }
                }
            }
        }
    }

}
