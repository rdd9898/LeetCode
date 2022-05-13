package daily_practice.may_2022.day13.question_1855;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1855.下标对中的最大距离
 * @date 2022年05月13日 13:27
 */
public class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int left = i;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums2[mid] > nums1[i]) {
                    left = mid + 1;
                } else if (nums2[mid] < nums1[i]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (right - i > ans) {
                ans = right - i;
            }
        }
        return ans;
    }
}
