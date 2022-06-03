package daily_practice.june_2022.day03.question_829;

/**
 * 二分查找，该方法复杂度为 O(n log n)，但是依旧超时，但是结果是对的，只是运行时间太长
 * @author 胡阳
 * @ClassName Solution
 * @description: 829.连续整数求和
 * @date 2022年06月03日 9:02
 */
public class Solution {

    public int consecutiveNumbersSum(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int left = i + 1;
            int right = n / 2 + 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                double sum = (mid - i + 1) / 2.0 * (mid + i);
                if (sum < n) {
                    left = mid + 1;
                } else if (sum > n) {
                    right = mid - 1;
                } else {
                    ans++;
                    break;
                }
            }
        }
        return ans + 1;
    }

}
