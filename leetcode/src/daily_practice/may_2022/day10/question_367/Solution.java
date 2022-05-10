package daily_practice.may_2022.day10.question_367;

/**
 * 注意内存越界问题
 * @author 胡阳
 * @ClassName Solution
 * @description: 367.有效的完全平方数
 * @date 2022年05月10日 10:29
 */
public class Solution {

    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int tmp = num / mid;
            if (tmp > mid) {
                left = mid + 1;
            } else if (tmp < mid) {
                right = mid - 1;
            } else {
                if (num % mid == 0) {
                    return true;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }

}
