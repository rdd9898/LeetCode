package daily_practice.may_2023.day05.offer_ii_008;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 008. 和大于等于 target 的最短子数组
 * @author: Mr.Hu
 * @create: 2023-05-05 21:39
 **/
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        int left = 0;
        int right = 0;
        int ans = 0;
        while (right < nums.length - 1 && sums[right] - sums[left] + nums[left] < target) right++;
        while (right < nums.length) {
            while (left < right && sums[right] - sums[left + 1] + nums[left + 1] >= target) left++;
            if (sums[right] - sums[left] + nums[left] >= target) {
                if (ans == 0) ans = right - left + 1;
                else ans = Integer.min(ans, right - left + 1);
            }
            right++;
        }
        return ans;
    }

}
