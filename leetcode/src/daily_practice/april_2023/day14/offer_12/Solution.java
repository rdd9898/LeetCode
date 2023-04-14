package daily_practice.april_2023.day14.offer_12;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 12. 矩阵中的路径
 * @author: Mr.Hu
 * @create: 2023-04-13 22:25
 **/
public class Solution {

    int m;
    int n;
    int[][] steps = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    boolean flag = false;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    dfs(i, j, 0, board, word);
                    if (flag) return flag;
                }
            }
        }
        return flag;
    }

    private void dfs(int i, int j, int index, char[][] board, String word) {
        if (index == word.length() - 1) {
            flag = true;
            return;
        }
        index++;
        board[i][j] = ' ';
        for (int[] step : steps) {
            if (i + step[0] < 0 || i + step[0] >= m || j + step[1] < 0 || j + step[1] >= n || word.charAt(index) != board[i + step[0]][j + step[1]]) continue;
            dfs(i + step[0], j + step[1], index, board, word);
        }
        board[i][j] = word.charAt(index - 1);
    }

}
