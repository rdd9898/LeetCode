package daily_practice.may_2023.day08.offer_ii_012;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 012. 左右两边子数组的和相等
 * @author: Mr.Hu
 * @create: 2023-05-08 15:33
 **/
public class Solution {

    public int pivotIndex(int[] nums) {
        int last = 0;
        for (int num : nums) {
            last += num;
        }
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            last -= nums[i];
            if (pre == last) return i;
            pre += nums[i];
        }
        return -1;
    }

}
