package daily_practice.march_2023.day30.question_40;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 40.组合总和 II
 * @author: Mr.Hu
 * @create: 2023-03-30 20:30
 **/
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    int temp = 0;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(-1, candidates, target, 0);
        return ans;
    }

    private void dfs(int index, int[] candidates, int target, int sum) {
        if (sum >= target) {
            if (sum == target) ans.add(new ArrayList<>(deque));
            return;
        }
        for (int i = index + 1; i < candidates.length; i++) {
            if (candidates[i] == temp) continue;
            deque.offerLast(candidates[i]);
            sum += candidates[i];
            dfs(i, candidates, target, sum);
            temp = deque.pollLast();
            sum -= candidates[i];
        }
    }

}
