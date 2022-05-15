package daily_practice.may_2022.day15.question_88;

/**
 * 逆向双指针
 * @author 胡阳
 * @ClassName Solution
 * @description: 88.合并两个有序数组
 * @date 2022年05月15日 13:06
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1, j = m - 1, k = n - 1; i >= 0; i--) {
            if (k >= 0 && j >= 0) {
                if (nums1[j] > nums2[k]) {
                    nums1[i] = nums1[j];
                    j--;
                } else {
                    nums1[i] = nums2[k];
                    k--;
                }
            } else if (k >= 0) {
                nums1[i] = nums2[k];
                k--;
            } else if (j >= 0) {
                nums1[i] = nums1[j];
                j--;
            }
        }
    }

}
