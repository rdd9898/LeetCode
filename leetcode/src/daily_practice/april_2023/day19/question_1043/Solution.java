package daily_practice.april_2023.day19.question_1043;

/**
 * @program: LeetCode
 * @description: 1043. 分隔数组以得到最大和
 * @author: Mr.Hu
 * @create: 2023-04-19 15:13
 **/
public class Solution {

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int max = arr[0];
        for (int i = 1; i < k; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            dp[i] = (i + 1) * max;
        }
        for (int i = k; i < arr.length; i++) {
            int tmp = Integer.MIN_VALUE;
            int tmpMax = arr[i];
            for (int j = i; j >= i - k + 1; j--) {
                if (tmpMax < arr[j]) tmpMax = arr[j];
                int cur = dp[j - 1] + tmpMax * (i - j + 1);
                if (cur > tmp) {
                    tmp = cur;
                }
            }
            dp[i] = tmp;
        }
        return dp[arr.length - 1];
    }

}
