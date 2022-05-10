package daily_practice.may_2022.day10.question_35;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 35.搜索插入位置
 * @date 2022年05月10日 9:52
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

}
