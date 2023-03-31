package daily_practice.march_2023.day30.question_47;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 47.全排列 II
 * @author: Mr.Hu
 * @create: 2023-03-30 16:28
 **/
public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    boolean[] temp;

    public List<List<Integer>> permuteUnique(int[] nums) {
        temp = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums, nums.length);
        return ans;
    }

    private void dfs(int[] nums, int length) {
        if (deque.size() == length) {
            ans.add(new ArrayList<>(deque));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (temp[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !temp[i - 1]) continue;
            deque.offerLast(nums[i]);
            temp[i] = true;
            dfs(nums, length);
            deque.pollLast();
            temp[i] = false;
        }
    }

}
