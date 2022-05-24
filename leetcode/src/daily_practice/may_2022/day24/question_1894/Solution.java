package daily_practice.may_2022.day24.question_1894;

/**
 * 计算
 * @author 胡阳
 * @ClassName Solution
 * @description: 1894.找出需要补充粉笔的学生编号
 * @date 2022年05月24日 10:46
 */
public class Solution {

    public int chalkReplacer(int[] chalk, int k) {
        int ans = 0;
        long sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }
        long tmp = k % sum;
        if (tmp < chalk[0]) {
            return 0;
        }
        tmp -= chalk[0];
        for (int i = 1; i < chalk.length; i++) {
            if (tmp < chalk[i]) {
                ans = i;
                break;
            }
            tmp -= chalk[i];
        }
        return ans;
    }

}
