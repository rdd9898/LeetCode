package daily_practice.march_2023.day30.question_39;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 39.组合总和
 * @author: Mr.Hu
 * @create: 2023-03-30 17:14
 **/
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, candidates, target, -1);
        return ans;
    }

    private void dfs(int index, int[] candidates, int target, int sum) {
        if (sum >= target) {
            if (sum == target) ans.add(new ArrayList<>(deque));
            return;
        }
        for (int i = index + 1; i < candidates.length; i++) {
            deque.offerLast(candidates[i]);
            sum += candidates[i];
            dfs(i, candidates, target, sum);
            deque.pollLast();
            sum -= candidates[i];
        }
    }

}
