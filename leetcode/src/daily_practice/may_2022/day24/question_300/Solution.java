package daily_practice.may_2022.day24.question_300;

/**
 * 有点难度
 * @author 胡阳
 * @ClassName Solution
 * @description: 300.最长递增子序列
 * @date 2022年05月24日 11:42
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        int len = 1;
        if (nums.length == 0) {
            return 0;
        }
        int[] d = new int[nums.length + 1];
        d[len] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > d[len]) {
                len++;
                d[len] = nums[i];
            } else {
                int left = 1;
                int right = len;
                int pos = 0;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (d[mid] < nums[i]) {
                        pos = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if (left == 0) {
                    d[1] = nums[i];
                } else {
                    d[pos + 1] = nums[i];
                }
            }
        }
        return len;
    }

}
