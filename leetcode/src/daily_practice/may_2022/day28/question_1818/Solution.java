package daily_practice.may_2022.day28.question_1818;

import java.util.Arrays;

/**
 * 想法一样，但是逻辑没绕过来，cv了
 * @program: LeetCode
 * @description: 1818.绝对差值和
 * @author: Mr.Hu
 * @create: 2022-05-28 12:11
 **/
public class Solution {

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        final int MOD = 1000000007;
        int n = nums1.length;
        int[] rec = new int[n];
        System.arraycopy(nums1, 0, rec, 0, n);
        Arrays.sort(rec);
        int sum = 0, maxn = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % MOD;
            int j = binarySearch(rec, nums2[i]);
            if (j < n) {
                maxn = Math.max(maxn, diff - (rec[j] - nums2[i]));
            }
            if (j > 0) {
                maxn = Math.max(maxn, diff - (nums2[i] - rec[j - 1]));
            }
        }
        return (sum - maxn + MOD) % MOD;
    }

    public int binarySearch(int[] rec, int target) {
        int low = 0, high = rec.length - 1;
        if (rec[high] < target) {
            return high + 1;
        }
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (rec[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
