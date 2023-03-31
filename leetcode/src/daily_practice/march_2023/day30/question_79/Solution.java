package daily_practice.march_2023.day30.question_79;

/**
 * @program: LeetCode
 * @description: 79.单词搜索
 * @author: Mr.Hu
 * @create: 2023-03-30 22:20
 **/
public class Solution {

    int[][] steps = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m;
    int n;
    boolean[][] flags;
    boolean find;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        int length = word.length();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] flags = new boolean[m][n];
                    dfs(0, i, j, board, word, length, flags);
                    if (find) return find;
                }
            }
        }
        return find;
    }

    private void dfs(int index, int i, int j, char[][] board, String word, int length, boolean[][] flags) {
        if (index == length - 1) {
            find = true;
            return;
        }
        flags[i][j] = true;
        for (int[] step : steps) {
            if (i + step[0] < 0 || i + step[0] >= m || j + step[1] < 0 || j + step[1] >= n || flags[i + step[0]][j + step[1]] || board[i + step[0]][j + step[1]] != word.charAt(index + 1)) continue;
            dfs(index + 1, i + step[0], j + step[1], board, word, length, flags);
        }
        flags[i][j] = false;
    }

}
