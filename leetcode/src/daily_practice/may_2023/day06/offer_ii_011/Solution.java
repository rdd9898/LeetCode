package daily_practice.may_2023.day06.offer_ii_011;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 011. 0 和 1 个数相同的子数组
 * @author: Mr.Hu
 * @create: 2023-05-06 16:09
 **/
public class Solution {

    public int findMaxLength(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) counter++;
            else counter--;
            if (map.containsKey(counter)) {
                ans = Integer.max(ans, i - map.get(counter));
            } else {
                map.put(counter, i);
            }
        }
        return ans;
    }

}
