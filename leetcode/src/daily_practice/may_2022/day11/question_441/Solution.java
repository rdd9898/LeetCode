package daily_practice.may_2022.day11.question_441;

/**
 * 注意：(long)后面不能加括号
 * @author 胡阳
 * @ClassName Solution
 * @description: 441.排列硬币
 * @date 2022年05月11日 10:55
 */
public class Solution {

    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long)mid * (mid + 1) > (long)n * 2) {
                right = mid - 1;
            } else if ((long)mid * (mid + 1) <= (long)n * 2) {
                left = mid + 1;
            }
        }
        return right;
    }

}
