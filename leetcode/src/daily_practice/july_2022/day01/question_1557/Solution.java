package daily_practice.july_2022.day01.question_1557;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 寻找入度为 0 的点，只有入度为 0，才必须要加入结果集中。·
 * @program: LeetCode
 * @description: 1557.可以到达所有点的最少点数目
 * @author: Mr.Hu
 * @create: 2022-07-01 10:55
 **/
public class Solution {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans = new ArrayList<Integer>();
        Set<Integer> endSet = new HashSet<Integer>();
        for (List<Integer> edge : edges) {
            endSet.add(edge.get(1));
        }
        for (int i = 0; i < n; i++) {
            if (!endSet.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

}
