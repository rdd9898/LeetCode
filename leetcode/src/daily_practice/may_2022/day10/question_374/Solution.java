package daily_practice.may_2022.day10.question_374;

import java.util.Random;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 374.猜数字大小
 * @date 2022年05月10日 9:33
 */
public class Solution {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int pick = 0;
        while(left <= right) {
            // 在该题目中，因为 1 <= n <= 2^31 - 1，不能使用 (left + right) / 2，会导致内存溢出。
            int mid = left + (right - left) / 2;
            int guessValue = guess(mid);
            if (guessValue == 1) {
                left = mid + 1;
            } else if (guessValue == -1) {
                right = mid - 1;
            } else {
                pick = mid;
                break;
            }
        }
        return pick;
    }

    private int guess(int mid) {
        int guessValue = 4;
        if (mid > guessValue) {
            return -1;
        } else if (mid < guessValue) {
            return 1;
        } else {
            return 0;
        }
    }

}
