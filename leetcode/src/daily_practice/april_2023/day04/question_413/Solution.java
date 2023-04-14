package daily_practice.april_2023.day04.question_413;

/**
 * @program: LeetCode
 * @description: 413.等差数列划分
 * @author: Mr.Hu
 * @create: 2023-04-04 21:16
 **/
public class Solution {

    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        int length = nums.length;
        boolean[][] bp = new boolean[length][length];
        for (int i = 0; i < length - 1; i++) {
            bp[i][i + 1] = true;
        }
        for (int L = 3; L <= length; L++) {
            for (int i = L - 1; i < length; i++) {
                if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                    bp[i - L + 1][i] = bp[i - L + 1][i - 1];
                    if (bp[i - L + 1][i]) ans++;
                }
            }
        }
        return ans;
    }

}
