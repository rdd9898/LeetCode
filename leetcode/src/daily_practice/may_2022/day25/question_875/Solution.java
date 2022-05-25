package daily_practice.may_2022.day25.question_875;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 875.爱吃香蕉的珂珂
 * @date 2022年05月25日 10:30
 */
public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int temp: piles) {
            right = Math.max(temp, right);
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cur = 0;
            for(int temp: piles) {
                cur += temp / mid;
                if (temp % mid != 0) cur++;
            }
            if (cur <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
