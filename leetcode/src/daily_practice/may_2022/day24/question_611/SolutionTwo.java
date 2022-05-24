package daily_practice.may_2022.day24.question_611;

import java.util.Arrays;

/**
 * 排序 + 双指针
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 611.有效三角形的个数
 * @date 2022年05月24日 9:44
 */
public class SolutionTwo {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1, k = i + 1; j < nums.length - 1; j++) {
                while (k + 1 < nums.length && nums[k + 1] < nums[i] + nums[j]) {
                    k++;
                }
                ans += Math.max(k - j, 0);
            }
        }
        return ans;
    }

}
