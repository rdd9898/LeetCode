package daily_practice.april_2023.day21.offer_39;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 39. 数组中出现次数超过一半的数字
 * @author: Mr.Hu
 * @create: 2023-04-21 16:51
 **/
public class Solution {

    public int majorityElement(int[] nums) {
        int ans = 0, tmp = 0;
        for (int num : nums) {
            if (tmp == 0) ans = num;
            tmp += ans == num ? 1 : -1;
        }
        return ans;
    }

}
