package daily_practice.june_2022.day03.question_829;

/**
 * 该题为困难，需要用到数学知识才能在所需时间内解决
 * @author 胡阳
 * @ClassName SolutionNormal
 * @description: 829.连续整数求和
 * @date 2022年06月03日 9:24
 */
public class SolutionNormal {

    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        int temp = 2 * n;
        boolean flag = false;
        for (int k = 1; k * (k + 1) <= temp; k++) {
            if (k % 2 == 0) {
                flag = true;
            } else {
                flag = false;
            }
            if (flag && n % k !=0 && temp % k == 0) {
                ans++;
            } else if (!flag && n % k ==0) {
                ans++;
            }
        }
        return ans;
    }

}
