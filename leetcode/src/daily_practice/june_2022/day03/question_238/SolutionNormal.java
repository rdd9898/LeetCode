package daily_practice.june_2022.day03.question_238;

/**
 * 使用返回数组做运算，其他跟前面一模一样，但是节省了 n 的空间
 * @author 胡阳
 * @ClassName SolutionNormal
 * @description: 238.除自身以外数组的乘积
 * @date 2022年06月03日 10:03
 */
public class SolutionNormal {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            temp *= nums[i];
            ans[i] = temp;
        }
        temp = nums[0];
        ans[0] = ans[1];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = temp * ans[i + 1];
            temp *= nums[i];
        }
        ans[n - 1] = temp;
        return ans;
    }

}
