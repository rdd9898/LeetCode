package daily_practice.march_2023.day16.question_529;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 529.扫雷游戏
 * @author: Mr.Hu
 * @create: 2023-03-16 20:19
 **/
public class Solution {

    int m;
    int n;
    int[][] steps = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        m = board.length;
        n = board[0].length;
        boolean[][] flag = new boolean[m][n];
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offerFirst(click);
        flag[click[0]][click[1]] = true;
        while (deque.size() != 0) {
            int[] cur = deque.pollFirst();
            int boom = 0;
            for (int[] step : steps) {
                if (cur[0] + step[0] < 0 || cur[0] + step[0] >= m || cur[1] + step[1] < 0 || cur[1] + step[1] >= n) continue;
                if (board[cur[0] + step[0]][cur[1] + step[1]] == 'M') boom++;
            }
            if (boom == 0) {
                board[cur[0]][cur[1]] = 'B';
                for (int[] step : steps) {
                    if (cur[0] + step[0] < 0 || cur[0] + step[0] >= m || cur[1] + step[1] < 0 || cur[1] + step[1] >= n || flag[cur[0] + step[0]][cur[1] + step[1]] || board[cur[0] + step[0]][cur[1] + step[1]] != 'E') continue;
                    deque.offerLast(new int[]{cur[0] + step[0], cur[1] + step[1]});
                    flag[cur[0] + step[0]][cur[1] + step[1]] = true;
                }
            }
            else board[cur[0]][cur[1]] = (char) ('0' + boom);
        }
        return board;
    }

}
