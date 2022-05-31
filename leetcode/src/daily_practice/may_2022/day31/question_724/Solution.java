package daily_practice.may_2022.day31.question_724;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 724.寻找数组的中心下标
 * @date 2022年05月31日 9:38
 */
public class Solution {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
