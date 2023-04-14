package daily_practice.april_2023.day12.offer_46;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 46. 把数字翻译成字符串
 * @author: Mr.Hu
 * @create: 2023-04-12 20:19
 **/
public class Solution {

    public int translateNum(int num) {
        String s = Integer.toString(num);
        if (s.length() == 1) return 1;
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int temp = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        if (temp > 25 || temp < 10) dp[1] = 1;
        else dp[1] = 2;
        for (int i = 2; i < s.length(); i++) {
            temp = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            if (temp > 25 || temp < 10) dp[i] = dp[i - 1];
            else dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[s.length() - 1];
    }

}
