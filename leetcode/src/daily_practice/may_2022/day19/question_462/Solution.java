package daily_practice.may_2022.day19.question_462;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 462.最少移动次数使数组元素相等Ⅱ
 * @author: Mr.Hu
 * @create: 2022-05-19 09:10
 **/
public class Solution {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[(nums.length - 1) / 2];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += Math.abs((nums[i] - mid));
        }
        return ans;
    }

}
