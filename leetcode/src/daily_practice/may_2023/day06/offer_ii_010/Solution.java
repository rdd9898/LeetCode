package daily_practice.may_2023.day06.offer_ii_010;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 010. 和为 k 的子数组
 * @author: Mr.Hu
 * @create: 2023-05-06 15:37
 **/
public class Solution {

    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int num : nums) {
            sum += num;
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

}
