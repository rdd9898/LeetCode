package daily_practice.april_2023.day17.offer_61;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 61. 扑克牌中的顺子
 * @author: Mr.Hu
 * @create: 2023-04-17 21:18
 **/
public class Solution {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int king = 0;
        int dilation = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                king++;
                continue;
            }
            if (i > 0) {
                if (nums[i] == nums[i - 1]) return false;
                else if (nums[i - 1] != 0) {
                    dilation += nums[i] - nums[i - 1] - 1;
                }
            }
        }
        return dilation <= king;
    }

}
