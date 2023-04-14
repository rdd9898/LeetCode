package daily_practice.april_2023.day13.offer_57;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 57. 和为s的两个数字
 * @author: Mr.Hu
 * @create: 2023-04-13 21:41
 **/
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) break;
            else if (nums[left] + nums[right] < target) left++;
            else right--;
        }
        return new int[]{nums[left], nums[right]};
    }

}
