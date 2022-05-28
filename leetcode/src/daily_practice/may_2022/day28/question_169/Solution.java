package daily_practice.may_2022.day28.question_169;

import java.util.Arrays;

/**
 * 中排序号间元素一定为答案
 * @program: LeetCode
 * @description: 169.多数元素
 * @author: Mr.Hu
 * @create: 2022-05-28 13:11
 **/
public class Solution {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
