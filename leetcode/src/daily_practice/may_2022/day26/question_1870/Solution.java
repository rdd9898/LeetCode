package daily_practice.may_2022.day26.question_1870;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1870.准时到达的列车最小时速
 * @date 2022年05月27日 10:48
 */
public class Solution {

    public int minSpeedOnTime(int[] dist, double hour) {
        int ans = -1;
        if (dist.length > hour + 1 || (hour % 1 == 0 && dist.length > hour)) {
            return ans;
        }
        int left = 1;
        int right = 0;
        int sum = 0;
        for (int i = 0; i < dist.length; i++) {
            sum += dist[i];
        }
        right = (int)(sum / hour);
        if (sum % hour != 0) right++;
        right = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            double cur = 0;
            for (int i = 0; i < dist.length - 1; i++) {
                cur += dist[i] / mid;
                if (dist[i] % mid != 0) cur++;
            }
            cur += dist[dist.length - 1] / (double) mid;
            if (cur <= hour) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
