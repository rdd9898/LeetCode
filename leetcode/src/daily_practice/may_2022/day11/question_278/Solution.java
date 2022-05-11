package daily_practice.may_2022.day11.question_278;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 278.第一个错误版本
 * @date 2022年05月11日 10:14
 */
public class Solution {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        if (mid >= 4) {
            return true;
        }
        return false;
    }

}
