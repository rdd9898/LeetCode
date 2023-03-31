package daily_practice.march_2023.day24.question_209;

/**
 * @program: LeetCode
 * @description: 209.长度最小的子数组
 * @author: Mr.Hu
 * @create: 2023-03-27 20:47
 **/
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        int length = nums.length;
        boolean find = false;
        while (j < length) {
            boolean flag = false;
            while (j < length) {
                sum += nums[j];
                j++;
                if (sum >= target) break;
            }
            while (i < j && sum - nums[i] >= target) {
                find = true;
                flag = true;
                sum -= nums[i];
                i++;
            }
            if (!flag && sum >= target) {
                flag = true;
                find = true;
            }
            if (flag) ans = Integer.min(ans, (j - i));
        }
        if (!find) return 0;
        return ans;
    }

}
