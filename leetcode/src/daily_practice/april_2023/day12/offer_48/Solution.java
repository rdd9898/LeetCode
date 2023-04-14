package daily_practice.april_2023.day12.offer_48;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 48. 最长不含重复字符的子字符串
 * @author: Mr.Hu
 * @create: 2023-04-12 20:40
 **/
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        StringBuffer sb = new StringBuffer();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        sb.append(s.charAt(0));
        int ans = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!sb.toString().contains(Character.toString(c))) {
                dp[i] = dp[i - 1] + 1;
                sb.append(s.charAt(i));
            } else {
                int index = sb.toString().indexOf(c);
                dp[i] = sb.length() - index;
                sb = sb.delete(0, index + 1).append(s.charAt(i));
            }
            if (dp[i] > ans) ans = dp[i];
        }
        return ans;
    }

}
