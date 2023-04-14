package daily_practice.april_2023.day11.offer_53_i;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 53 - I. 在排序数组中查找数字 I
 * @author: Mr.Hu
 * @create: 2023-04-11 21:49
 **/
public class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        int ans = 0;
        for (int i = left; i < nums.length; i++) {
            if (nums[i] != target) break;
            ans++;
        }
        return ans;
    }

}
