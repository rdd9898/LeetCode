package daily_practice.may_2022.day28.question_136;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 126.只出现一次的数字
 * @author: Mr.Hu
 * @create: 2022-05-28 12:49
 **/
public class Solution {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i+1]) {
                i++;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

}
