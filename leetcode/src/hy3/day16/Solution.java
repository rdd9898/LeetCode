package com.hy.day16;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/9 17:30
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int countKDifference(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            ans += map.getOrDefault(nums[i] - k, 0) + map.getOrDefault(nums[i] + k, 0);
        }
        return ans;
    }
}
