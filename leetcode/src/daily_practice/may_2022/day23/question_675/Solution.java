package daily_practice.may_2022.day23.question_675;

import java.util.List;

/**
 * 失败，没有考虑到树砍到后的位置还是可以走的
 * @author 胡阳
 * @ClassName Solution
 * @description: 675.为高尔夫比赛砍树
 * @date 2022年05月23日 9:02
 */
public class Solution {

    static int[][] tmp = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    public int cutOffTree(List<List<Integer>> forest) {
        int m = forest.size();
        int n = forest.get(0).size();
        boolean[][] flags = new boolean[m][n];
        bfs(0, 0, forest, flags, m, n);
        int ans = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!flags[i][j] && forest.get(i).get(j) != 0) {
                    return -1;
                } else if (forest.get(i).get(j) != 0){
                    ans++;
                }
            }
        }
        return ans;
    }
    public void bfs(int x, int y, List<List<Integer>> forest, boolean[][] flags, int m, int n) {
        if (flags[x][y]) {
            return;
        }
        int minx = -1;
        int miny = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tmp.length; i++) {
            x += tmp[i][0];
            y += tmp[i][1];
            if (x >= 0 && x < m && y >= 0 && y < n && forest.get(x).get(y) > 0 && !flags[x][y]) {
                if (forest.get(x).get(y) < min) {
                    min = forest.get(x).get(y);
                    minx = x;
                    miny = y;
                }
            }
            x -= tmp[i][0];
            y -= tmp[i][1];
        }
        flags[x][y] = true;
        if (minx != -1 && miny != -1) {
            bfs(minx, miny, forest, flags, m, n);
        }
    }

}
