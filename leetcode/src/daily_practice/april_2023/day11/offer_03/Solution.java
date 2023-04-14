package daily_practice.april_2023.day11.offer_03;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 03. 数组中重复的数字
 * @author: Mr.Hu
 * @create: 2023-04-11 21:35
 **/
public class Solution {

    public int findRepeatNumber(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (flag[nums[i]]) {
                ans = nums[i];
                break;
            }
            flag[nums[i]] = true;
        }
        return ans;
    }

}
