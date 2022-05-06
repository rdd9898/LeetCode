package daily_practice.undefined_2022.hy3.day21;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/14 1:49
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 != 0 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
