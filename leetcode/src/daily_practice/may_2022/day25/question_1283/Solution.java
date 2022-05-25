package daily_practice.may_2022.day25.question_1283;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1283.使结果不超过阙值的最小除数
 * @date 2022年05月25日 11:23
 */
public class Solution {

    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for (int temp: nums) right = Math.max(right, temp);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cur = 0;
            for (int temp: nums) {
                cur += temp / mid;
                if (temp % mid != 0) cur++;
            }
            if (cur > threshold) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
