package daily_practice.may_2022.day17.question_36;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 36.有效的数独
 * @date 2022年05月17日 10:23
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        int[] tmp1 = new int[10];
        int[] tmp2 = new int[10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    tmp1[board[i][j] - '0']++;
                    if (tmp1[board[i][j] - '0'] > 1) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    tmp2[board[j][i] - '0']++;
                    if (tmp2[board[j][i] - '0'] > 1) {
                        return false;
                    }
                }
            }
            Arrays.fill(tmp1, 0);
            Arrays.fill(tmp2, 0);
        }
        int[] tmp3 = new int[10];
        int x = -3;
        int y = 0;
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) x += 3;
            for (int j = 0; j < 9; j++) {
                if (board[x][y] != '.') {
                    tmp3[board[x][y] - '0']++;
                    if (tmp3[board[x][y] - '0'] > 1) {
                        return false;
                    }
                }

                y++;
                if (y % 3 == 0) {
                    y -= 3;
                    x++;
                }
            }
            if (x % 3 == 0) x -= 3;
            y += 3;
            if (y == 9) y = 0;
            Arrays.fill(tmp3, 0);
        }
        return true;
    }

}
