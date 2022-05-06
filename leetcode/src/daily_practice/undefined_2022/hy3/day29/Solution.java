package daily_practice.undefined_2022.hy3.day29;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/25 23:54
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > min){
                if (nums[i] - min > ans) {
                    ans = nums[i] - min;
                }
            }
        }
        return ans;
    }
}
