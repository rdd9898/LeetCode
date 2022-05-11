package daily_practice.may_2022.day11.question_34;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 34.在排序数组中查找元素的第一和最后一个位置
 * @date 2022年05月11日 10:29
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[]{-1, -1};

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left < nums.length && left >= 0 && nums[left] == target) {
            ans[0] = left;
        } else {
            return ans;
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                left = mid + 1;
            }
        }

        ans[1] = right;
        return ans;

    }

}
