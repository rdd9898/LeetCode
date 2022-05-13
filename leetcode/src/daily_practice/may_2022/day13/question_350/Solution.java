package daily_practice.may_2022.day13.question_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 350.两个数组的交集Ⅱ
 * @date 2022年05月13日 11:00
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int size = 0;
        for (int i = 0; i < m; i++) {
            int left = size;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums2[mid] > nums1[i]) {
                    right = mid - 1;
                } else if (nums2[mid] < nums1[i]) {
                    left = mid + 1;
                } else {
                    nums2[mid] = -1;
                    size++;
                    Arrays.sort(nums2);
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

}
