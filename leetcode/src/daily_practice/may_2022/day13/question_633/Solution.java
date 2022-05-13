package daily_practice.may_2022.day13.question_633;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 633.平方数之和
 * @date 2022年05月13日 11:36
 */
public class Solution {

    public boolean judgeSquareSum(int c) {
        int n = (int) Math.sqrt(c);
        for (int i = 0; i <= n; i++) {
            int left = 0;
            int right = n;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long)mid * mid + i * i < (long)c) {
                    left = mid + 1;
                } else if((long)mid * mid + i * i > (long)c) {
                    right = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

}
