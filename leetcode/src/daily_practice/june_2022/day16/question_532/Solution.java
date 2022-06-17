package daily_practice.june_2022.day16.question_532;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 532.数组中的 k-diff 数对
 * @date 2022年06月16日 9:16
 */
public class Solution {

    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] - nums[i] > k) {
                    right = mid - 1;
                } else if (nums[mid] - nums[i] < k) {
                    left = mid + 1;
                } else {
                    if (set.add(nums[i])) {
                        ans++;
                    }
                    break;
                }
            }
        }
        return ans;
    }

}
