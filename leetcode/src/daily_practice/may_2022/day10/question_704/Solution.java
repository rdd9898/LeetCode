package daily_practice.may_2022.day10.question_704;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 704.二分查找
 * @date 2022年05月10日 9:28
 */
public class Solution {

    public int search(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
