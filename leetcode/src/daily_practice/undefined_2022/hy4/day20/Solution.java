package daily_practice.undefined_2022.hy4.day20;

/**
 * @program: LeetCode
 * @description: 713.乘积小于 K 的子数组
 * @author: Mr.Hu
 * @create: 2022-05-05 10:30
 **/
public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ret = 0;
        int prod = 1, i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            // 计算 [i, j] 里，以 j 为结尾的子数组。
            ret += j - i + 1;
        }
        return ret;
    }
}
