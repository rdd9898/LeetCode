package daily_practice.april_2023.day25.offer_59_i;

import java.util.ArrayDeque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 59 - I. 滑动窗口的最大值
 * @author: Mr.Hu
 * @create: 2023-04-25 14:55
 **/
public class Solution2 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return null;
        if (k == 1) return nums;
        int[] ans = new int[nums.length - k + 1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if (queue.size() == 0 || nums[i] <= queue.peekLast()) {
                queue.addLast(nums[i]);
            }
            else {
                while (queue.size() != 0 && nums[i] > queue.peekLast()) {
                    queue.pollLast();
                }
                queue.addLast(nums[i]);
            }
            if (i >= k) {
                if (queue.peekFirst() == nums[i - k]) queue.pollFirst();
            }
            if (i - k + 1 >= 0) ans[i - k + 1] = queue.peekFirst();
        }
        return ans;
    }

}
