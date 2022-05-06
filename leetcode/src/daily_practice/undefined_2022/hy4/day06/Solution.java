package daily_practice.undefined_2022.hy4.day06;

/**
 * @program: LeetCode
 * @description: 396.旋转函数
 * @author: Mr.Hu
 * @create: 2022-04-22 10:56
 **/
public class Solution {

    /**
    * @Description: 暴力解法
    * @Param: int[] nums
    * @return: int ans
    * @Author: Mr.Wang
    * @Date: 2022/4/22
    */
    public int maxRotateFunction(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int tmp = 0;
            for (int index = i, j = 0; j < n; j++, index++) {
                if (index >= n) {
                    index = index - n;
                }
                tmp += nums[index] * j;
            }
            if (tmp > ans) {
                ans = tmp;
            }
        }
        return ans;
    }

    /**
    * @Description: 优化后时间复杂度变为n
    * @Param: int[] nums
    * @return: int ans
    * @Author: Mr.Wang
    * @Date: 2022/4/22
    */
    public int maxRotateFunction2(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int tmp = 0;
        for (int i = 0; i < n; i++) {
            tmp += nums[i] * i;
        }
        ans = tmp;

        for (int i = 1; i < n; i++) {
            tmp = tmp + sum - n * nums[n - i];
            if (tmp > ans) {
                ans = tmp;
            }
        }
        return ans;
    }

}
