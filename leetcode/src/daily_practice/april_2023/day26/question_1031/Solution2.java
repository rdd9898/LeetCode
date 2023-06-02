package daily_practice.april_2023.day26.question_1031;

/**
 * @program: LeetCode
 * @description: 1031. 两个非重叠子数组的最大和
 * @author: Mr.Hu
 * @create: 2023-04-26 10:37
 **/
public class Solution2 {

    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int length = nums.length;
        // 记录前缀和
        int[] sum = new int[length + 1];
        for (int i = 0; i < length; i++) sum[i + 1] += nums[i] + sum[i];
        // 记录前 i 个数中，子数组长度为 firstLen 最大连续和
        int[] firstMax = new int[length + 1];
        // 记录前 i 个数中，子数组长度为 secondLen 最大连续和
        int[] secondMax = new int[length + 1];
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= length; i++) {
            // 固定一个窗口在末尾
            if (i >= firstLen + secondLen) {
                ans = Math.max(ans, firstMax[i - secondLen] + sum[i] - sum[i - secondLen]);
                ans = Math.max(ans, secondMax[i - firstLen] + sum[i] - sum[i - firstLen]);
            }
            if (i >= firstLen) firstMax[i] = Math.max(firstMax[i - 1], sum[i] - sum[i - firstLen]);
            if (i >= secondLen) secondMax[i] = Math.max(secondMax[i - 1], sum[i] - sum[i - secondLen]);
        }
        return ans;
    }

}
