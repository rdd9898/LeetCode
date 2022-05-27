package daily_practice.may_2022.day27.question_1482;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1482.制作 m 束花所需的最少天数
 * @date 2022年05月27日 11:28
 */
public class Solution {

    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) {
            return -1;
        }
        int left = 1;
        int right = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            right = Math.max(bloomDay[i], right);
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cur = 0;
            int flag = 0;
            if (bloomDay[0] <= mid) flag++;
            if (flag == k) {
                cur++;
                flag = 0;
            }
            for (int i = 1; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid && flag != 0) {
                    flag++;
                } else if (bloomDay[i] <= mid) {
                    flag = 1;
                } else {
                    flag = 0;
                }
                if (flag == k) {
                    cur++;
                    flag = 0;
                }
            }
            if (cur < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
