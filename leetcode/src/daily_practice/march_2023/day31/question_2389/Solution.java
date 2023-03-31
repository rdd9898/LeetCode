package daily_practice.march_2023.day31.question_2389;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 2389.和有限的最长子序列
 * @author: Mr.Hu
 * @create: 2023-03-31 09:52
 **/
public class Solution {

    public int[] answerQueries (int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] <= queries[i]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            queries[i] = right;
        }
        return queries;
    }

}
