package daily_practice.march_2023.day28.question_78;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 78.子集
 * @author: Mr.Hu
 * @create: 2023-03-28 21:53
 **/
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    public List<List<Integer>> subsets(int[] nums) {
        ans.add(new ArrayList<>());
        dfs(nums, 0, nums.length);
        return ans;
    }

    private void dfs(int[] nums, int i, int length) {
        if (deque.size() == length) return;

        for (int x = i; x < length; x++) {
            if (deque.contains(nums[x])) continue;
            deque.offerLast(nums[x]);
            ans.add(new ArrayList<>(deque));
            dfs(nums, x, length);
            deque.pollLast();
        }
    }

}
