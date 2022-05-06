package daily_practice.undefined_2022.hy.day40;
//2104.子数组范围和
/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月04日 9:51
 */
public class Solution {
    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int max = nums[i];
            int min = nums[i];
            for (int j = i; j < n; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
                if (nums[j] < min) {
                    min = nums[j];
                }
                ans += max - min;
            }
        }
        return ans;
    }
}
