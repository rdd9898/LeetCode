package com.hy.day18;

import java.util.Arrays;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/11 11:00
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - k + 1; i++) {
            if (nums[i+k-1] - nums[i] < ans) {
                ans = nums[i+k-1] - nums[i];
            }
        }

        return ans;
    }
}
