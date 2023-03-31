package daily_practice.march_2023.day28.question_797;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 797.所有可能的路径
 * @author: Mr.Hu
 * @create: 2023-03-28 21:17
 **/
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        deque.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return ans;
    }

    private void dfs(int[][] graph, int x, int n) {
        if (x == n) {
            ans.add(new ArrayList<>(deque));
            return;
        }
        for (int i = 0; i < graph[x].length; i++) {
            deque.offerLast(graph[x][i]);
            dfs(graph, graph[x][i], n);
            deque.pollLast();
        }
    }

}
