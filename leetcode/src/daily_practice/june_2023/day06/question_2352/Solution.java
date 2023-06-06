package daily_practice.june_2023.day06.question_2352;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 2352. 相等行列对
 * @author: Mr.Hu
 * @create: 2023-06-06 15:07
 **/
public class Solution {

    public int equalPairs(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                cur.add(grid[i][j]);
            }
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                cur.add(grid[j][i]);
            }
            ans += map.getOrDefault(cur, 0);
        }
        return ans;
    }
}
