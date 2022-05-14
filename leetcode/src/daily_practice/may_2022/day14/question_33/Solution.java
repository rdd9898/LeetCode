package daily_practice.may_2022.day14.question_33;

/**
 * 注意，将数组从中间分开后一半有序一半无序
 * @program: LeetCode
 * @description: 33.搜索旋转排序数组
 * @author: Mr.Hu
 * @create: 2022-05-14 11:15
 **/
public class Solution {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[0] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[0]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[n - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

}
