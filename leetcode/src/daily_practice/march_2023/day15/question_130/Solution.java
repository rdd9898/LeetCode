package daily_practice.march_2023.day15.question_130;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 130.被围绕的区域
 * @author: Mr.Hu
 * @create: 2023-03-14 22:21
 **/
public class Solution {

    int m;
    int n;
    int[][] steps = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean isTrue;

    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        boolean[][] flag = new boolean[m][n];
        for (int i = 0; i < m * n; i++) {
            int x = i / n;
            int y = i % n;
            if (board[x][y] == 'X' || flag[x][y]) continue;
            isTrue = true;
            List<Integer> list = new ArrayList<>();
            dfs(x, y, board, flag, list);
            if (isTrue) {
                for (int j = 0; j < list.size(); j += 2) {
                    board[list.get(j)][list.get(j + 1)] = 'X';
                }
            }
        }
    }

    private void dfs(int x, int y, char[][] board, boolean[][] flag, List<Integer> list) {
        flag[x][y] = true;
        list.add(x);
        list.add(y);
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n) isTrue = false;
        }
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n || board[x + step[0]][y + step[1]] == 'X' || flag[x + step[0]][y + step[1]]) continue;
            dfs(x + step[0], y + step[1], board, flag, list);
        }
    }

}
