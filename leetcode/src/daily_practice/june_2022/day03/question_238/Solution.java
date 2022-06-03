package daily_practice.june_2022.day03.question_238;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 238.除自身以外数组的乘积
 * @date 2022年06月03日 10:01
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] tmp = new int[n];
        int temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            temp *= nums[i];
            tmp[i] = temp;
        }
        temp = nums[0];
        ans[0] = tmp[1];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = temp * tmp[i + 1];
            temp *= nums[i];
        }
        ans[n - 1] = temp;
        return ans;
    }

}
