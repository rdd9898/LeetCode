package daily_practice.april_2023.day25.offer_59_i;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 59 - I. 滑动窗口的最大值
 * @author: Mr.Hu
 * @create: 2023-04-25 10:48
 **/
public class Solution {

    /**
    * @Description: 此方法超时，使用队列记录某位置到窗口尾的最大值
    * @Param: [nums, k]
    * @return: int[]
    * @Author: HuYang
    * @Date: 2023/4/25
    */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return null;
        if (k == 1) return nums;
        int[] ans = new int[nums.length - k + 1];
        ArrayDeque<Integer> queue1 = new ArrayDeque<>();
        int max = nums[k - 1];
        queue1.addFirst(max);
        for (int i = k - 2; i >= 0; i--) {
            max = Integer.max(max, nums[i]);
            queue1.addFirst(max);
        }
        ans[0] = max;
        for (int i = k; i < nums.length; i++) {
            queue1.pollFirst();
            int index = 0;
            while (queue1.size() != 0 && queue1.peekLast() < nums[i]) {
                queue1.pollLast();
                index++;
            }
            for (int j = 0; j <= index; j++) {
                queue1.addLast(nums[i]);
            }
            ans[i - k + 1] = queue1.peekFirst();
        }
        return ans;
    }

}
