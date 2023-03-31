package daily_practice.march_2023.day24.question_713;

/**
 * @program: LeetCode
 * @description: 713.乘积小于 K 的子数组
 * @author: Mr.Hu
 * @create: 2023-03-23 22:03
 **/
public class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int temp = nums[j];
            while (temp < k) {
                j++;
                ans++;
                if (j < nums.length) temp *= nums[j];
                else break;
            }
        }
        return ans;
    }

}
