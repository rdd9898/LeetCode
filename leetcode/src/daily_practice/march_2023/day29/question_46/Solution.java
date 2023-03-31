package daily_practice.march_2023.day29.question_46;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 46.全排列
 * @author: Mr.Hu
 * @create: 2023-03-29 22:26
 **/
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> temp = new ArrayDeque<>();

    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, nums.length);
        return ans;
    }

    private void dfs(int[] nums, int length) {
        if (temp.size() == length) {
            ans.add(new ArrayList<>(temp));
        }
        for (int i = 0; i < length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.offerLast(nums[i]);
            dfs(nums, length);
            temp.pollLast();
        }
    }

}
