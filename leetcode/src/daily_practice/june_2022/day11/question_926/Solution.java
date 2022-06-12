package daily_practice.june_2022.day11.question_926;

/**
 * 前缀和，依次遍历每个位置，查看左边有几个 1，右边有几个 0，和最小为答案
 * @program: LeetCode
 * @description: 926.将字符串翻转到单调递增
 * @author: Mr.Hu
 * @create: 2022-06-11 11:50
 **/
public class Solution {

    public int minFlipsMonoIncr(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length, ans = n;
        int[] sum = new int[n + 10];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + (cs[i - 1] - '0');
        for (int i = 1; i <= n; i++) {
            int l = sum[i - 1], r = (n - i) - (sum[n] - sum[i]);
            ans = Math.min(ans, l + r);
        }
        return ans;
    }

}
