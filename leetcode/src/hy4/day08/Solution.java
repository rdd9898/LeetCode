package hy4.day08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 417.太平洋大西洋水流问题
 * @date 2022年04月27日 10:43
 */
public class Solution {

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int[][] heights;
    int m;
    int n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        m = heights.length;
        n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic  = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            bfs(i, 0, pacific);
        }
        for (int i = 1; i < n; i++) {
            bfs(0, i, pacific);
        }
        for (int i = 0; i < m; i++) {
            bfs(i, n-1, atlantic);
        }
        for (int i = 0; i < n - 1; i++) {
            bfs(m - 1, i, atlantic);
        }
        List<List<Integer>> answers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(i);
                    ans.add(j);
                    answers.add(ans);
                }
            }
        }
        return answers;
    }

    public void bfs(int row, int col, boolean[][] ocean) {
        if (ocean[row][col]) {
            return;
        }
        ocean[row][col] = true;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{row,col});
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int[] dir: dirs) {
                // 注意：不能直接设为一个数组，因为可能有-1的情况，数组不能生成-1
                int newRow = cell[0] + dir[0], newCol = cell[1] + dir[1];
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && heights[newRow][newCol] >= heights[cell[0]][cell[1]] && !ocean[newRow][newCol]) {
                    ocean[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }

            }
        }
    }

}
