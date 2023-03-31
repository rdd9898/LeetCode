package daily_practice.march_2023.day20.question_153;

/**
 * @program: LeetCode
 * @description: 153.寻找旋转排序数组中的最小值
 * @author: Mr.Hu
 * @create: 2023-03-20 20:09
 **/
public class Solution {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

}
