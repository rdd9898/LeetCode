package daily_practice.march_2023.day20.question_162;

/**
 * @program: LeetCode
 * @description: 162.寻找峰值
 * @author: Mr.Hu
 * @create: 2023-03-20 20:59
 **/
public class Solution {

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
