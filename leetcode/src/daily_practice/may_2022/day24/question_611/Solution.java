package daily_practice.may_2022.day24.question_611;

import java.util.Arrays;

/**
 * 排序 ＋ 二分查找
 * @author 胡阳
 * @ClassName Solution
 * @description: 611.有效三角形的个数
 * @date 2022年05月24日 9:25
 */
public class Solution {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (nums[i] + nums[j] <= nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                ans += (right - j);
            }
        }
        return ans;
    }

}
