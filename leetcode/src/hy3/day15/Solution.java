package com.hy.day15;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/7 17:37
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 1) {
                ans += key;
            }
        }
        return ans;
    }
}
