package daily_practice.may_2022.day11.question_69;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 69.x 的平方根
 * @date 2022年05月11日 9:34
 */
public class Solution {

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = x / mid;
            if (num > mid + 1) {
                left = mid + 1;
            } else if (num < mid - 1) {
                right = mid - 1;
            } else {
                ans = mid > num ? num : mid;
                break;
            }
        }
        return ans;
    }

}
