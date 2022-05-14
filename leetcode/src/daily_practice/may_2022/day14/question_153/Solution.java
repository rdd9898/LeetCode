package daily_practice.may_2022.day14.question_153;

/**
 * @program: LeetCode
 * @description: 153.寻找旋转排序数组的最小值
 * @author: Mr.Hu
 * @create: 2022-05-14 11:27
 **/
public class Solution {

    public int findMin(int[] nums) {

        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) {
                if (ans > nums[left]) ans = nums[left];
                left = mid + 1;
            } else {
                if (ans > nums[mid]) ans = nums[mid];
                right = mid - 1;
            }

        }
        return ans;
    }

}
