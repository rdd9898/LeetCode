package daily_practice.undefined_2022.hy3.day23;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/18 16:37
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] edge: edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
        }
        int ans = 0;
        for (Map.Entry entry: map.entrySet()) {
            if ((Integer) entry.getValue() == edges.length) {
                ans = (Integer) entry.getKey();
            }
        }
        return ans;
    }
}
