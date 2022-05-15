package daily_practice.may_2022.day15.question_53;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 53.最大子数组和
 * @date 2022年05月15日 11:28
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        int min = 0;
        for (int num: nums) {
            sum += num;
            if (sum - min > ans) {
                ans = sum - min;
            }
            if (sum < min) {
                min = sum;
            }
        }
        return ans;
    }

}
