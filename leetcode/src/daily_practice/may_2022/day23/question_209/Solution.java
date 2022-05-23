package daily_practice.may_2022.day23.question_209;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 209.长度最小的子数组
 * @date 2022年05月23日 12:25
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int[] sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sums[mid] - sums[i] + nums[i] >= target) {
                    if (mid - i + 1 < ans) {
                        ans = mid - i + 1;
                    }
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (ans != Integer.MAX_VALUE) {
            return ans;
        }
        return 0;
    }

}
