package daily_practice.may_2022.day29.question_1838;

import java.util.Arrays;

/**
 * 二分不会捏
 *
 * @author 胡阳
 * @ClassName Solution
 * @description: 1838.最高频元素的频数
 * @date 2022年05月29日 12:16
 */
public class Solution {


    int[] nums, sum;
    int n, k;

    public int maxFrequency(int[] _nums, int _k) {
        nums = _nums;
        k = _k;
        n = nums.length;
        Arrays.sort(nums);
        sum = new int[n + 1];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + nums[i - 1];
        int l = 0, r = n;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (check(mid)) l = mid;
            else r = mid - 1;
        }
        return r;
    }

    boolean check(int len) {
        for (int l = 0; l + len - 1 < n; l++) {
            int r = l + len - 1;
            int cur = sum[r + 1] - sum[l];
            int t = nums[r] * len;
            if (t - cur <= k) return true;
        }
        return false;
    }


}
