package daily_practice.march_2023.day08.question_1091;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 1091.二进制矩阵中的最短路径
 * @author: Mr.Hu
 * @create: 2023-03-08 20:26
 * @Method: 通过广度优先算法解决
 **/
public class Solution {

    private int[][] step = {{0, 1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 0}, {1, 1}};
    private int m;
    private int n;
    boolean flagFind = false;

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        m = grid.length;
        n = grid[0].length;
        int[][] flag = new int[m][n];
        flag[0][0] = 1;
        boolean flagFind = false;
        int ans = 0;
        int size = 1;
        int temSize = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        int[] ints = {0, 0};
        deque.offerFirst(ints);
        while (deque.size() != 0) {
            int[] tmp = deque.pollFirst();
            int x = tmp[0];
            int y = tmp[1];
            if (x == m - 1 && y == n - 1) {
                flagFind = true;
                ans++;
                break;
            }
            size--;
            if (size == 0) {
                ans++;
            }
            for (int i = 0; i < 8; i++) {
                if (x + step[i][0] < 0 || x + step[i][0] >= m || y + step[i][1] < 0 || y + step[i][1] >= n || flag[x + step[i][0]][ y + step[i][1]] == 1 || grid[x + step[i][0]][ y + step[i][1]] == 1) {
                    continue;
                }
                deque.offerLast(new int[]{x + step[i][0], y + step[i][1]});
                flag[x + step[i][0]][y + step[i][1]] = 1;
                temSize++;
            }
            if (size == 0) {
                size = temSize;
                temSize = 0;
            }
        }
        if (!flagFind) return -1;
        return ans;
    }

}
