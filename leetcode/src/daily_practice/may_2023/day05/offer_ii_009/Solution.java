package daily_practice.may_2023.day05.offer_ii_009;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 009. 乘积小于 K 的子数组
 * @author: Mr.Hu
 * @create: 2023-05-05 22:24
 **/
public class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int tmp = 1;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            tmp *= nums[i];
            while (left < i && tmp >= k) {
                tmp /= nums[left];
                left++;
            }
            if (tmp < k) ans += i - left + 1;
        }
        return ans;
    }

}
