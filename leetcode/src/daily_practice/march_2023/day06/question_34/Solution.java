package daily_practice.march_2023.day06.question_34;

/**
 * @program: LeetCode
 * @description: 34.在排序数组中查找元素的第一个和最后一个位置
 * @author: Mr.Hu
 * @create: 2023-03-06 20:03
 **/
public class Solution {

    /**
    * @Description: 二分查找，注意边界问题
    * @Param: [nums, target]
    * @return: int[]
    * @Author: HuYang
    * @Date: 2023/3/6
    */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left == nums.length) return new int[]{-1, -1};
        if (nums[left] != target) return new int[]{-1, -1};
        int a = left;
        int b = a;
        for (int i = a + 1; i < nums.length; i++) {
            if (nums[i] == target) b = i;
            else break;
        }
        return new int[]{a, b};
    }
}
