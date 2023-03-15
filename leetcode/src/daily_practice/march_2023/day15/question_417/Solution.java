package daily_practice.march_2023.day15.question_417;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 417.太平洋大西洋水流问题
 * @author: Mr.Hu
 * @create: 2023-03-15 10:58
 **/
public class Solution {

    int m;
    int n;
    int[][] steps = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        int[][] flag1 = new int[m][n];
        boolean pacific = true;
        for (int i = 0; i < m; i++) {
            if (flag1[i][0] >= 1) continue;
            dfs(i, 0, heights, flag1, pacific);
        }
        for (int i = 1; i < n; i++) {
            if (flag1[0][i] >= 1) continue;
            dfs(0, i, heights, flag1, pacific);
        }
        int[][] flag2 = new int[m][n];
        pacific = false;
        for (int i = 0; i < m; i++) {
            if (flag2[i][n - 1] >= 1) continue;
            dfs(i, n - 1, heights, flag2, pacific);
        }
        for (int i = 0; i < n - 1; i++) {
            if (flag2[m - 1][i] >= 1) continue;
            dfs(m - 1, i, heights, flag2, pacific);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag1[i][j] + flag2[i][j] == 2) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }

    private void dfs(int x, int y, int[][] heights, int[][] flag, boolean pacific) {
        flag[x][y]++;
        for (int[] step : steps) {
            if (x + step[0] < 0 || x + step[0] >= m || y + step[1] < 0 || y + step[1] >= n ||
                flag[x + step[0]][y + step[1]] == 1 || heights[x + step[0]][y + step[1]] < heights[x][y]) continue;
            dfs(x + step[0], y + step[1], heights, flag, pacific);
        }
    }

}
