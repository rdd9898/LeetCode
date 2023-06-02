package daily_practice.april_2023.day20.offer_ii_010;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 010. 和为 k 的子数组
 * @author: Mr.Hu
 * @create: 2023-04-20 16:22
 **/
public class Solution {

    public int subarraySum(int[] nums, int k) {
        int temp = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            temp = temp + num;
            ans += map.getOrDefault(temp - k, 0);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        return ans;
    }

}
