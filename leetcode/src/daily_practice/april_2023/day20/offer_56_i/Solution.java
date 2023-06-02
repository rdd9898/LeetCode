package daily_practice.april_2023.day20.offer_56_i;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 56 - I. 数组中数字出现的次数
 * @author: Mr.Hu
 * @create: 2023-04-20 21:22
 **/
public class Solution {

    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int div = 1;
        while ((div & ret) == 0) div <<= 1;
        ret = div;
        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & ret) == 0) a ^= num;
            else b ^= num;
        }
        return new int[]{a, b};
    }

}
