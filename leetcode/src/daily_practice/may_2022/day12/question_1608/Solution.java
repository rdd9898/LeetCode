package daily_practice.may_2022.day12.question_1608;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 1608. 特殊数组的特征值
 * @author: Mr.Hu
 * @create: 2022-05-12 10:50
 **/
public class Solution {

    public int specialArray(int[] nums) {
        int ans = -1;
        int n = nums.length;
        Arrays.sort(nums);
        int left = 1;
        int right = nums[n-1] + 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (mid < excuteMax(mid, nums)) {
                left = mid + 1;
            } else if (mid > excuteMax(mid, nums)){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return ans;
    }

    private int excuteMax(int n, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= n) {
                return nums.length - i;
            }
        }
        return 0;
    }

}
