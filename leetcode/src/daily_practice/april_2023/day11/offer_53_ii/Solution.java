package daily_practice.april_2023.day11.offer_53_ii;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @author: Mr.Hu
 * @create: 2023-04-11 21:57
 **/
public class Solution {

    public int missingNumber(int[] nums) {
//        int ans = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != i) {
//                ans = i;
//                break;
//            }
//        }
//        if (ans == -1) return nums.length;
//        return ans;

        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) left = mid + 1;
            else right = mid;
        }
        return left;
    }

}
