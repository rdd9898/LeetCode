package daily_practice.march_2023.day24.question_713;

/**
 * @program: LeetCode
 * @description: 713.乘积小于 K 的子数组
 * @author: Mr.Hu
 * @create: 2023-03-24 16:52
 **/
public class SolutionTwo {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ret = 0;
        int prod = 1, i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            ret += j - i + 1;
        }
        return ret;
    }

}
