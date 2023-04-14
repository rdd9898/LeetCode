package daily_practice.april_2023.day12.offer_48;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 48. 最长不含重复字符的子字符串
 * @author: Mr.Hu
 * @create: 2023-04-12 20:40
 **/
public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        map.put(s.charAt(0), 0);
        int pre = 0;
        int ans = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c) || map.get(c) < pre) {
                dp[i] = dp[i - 1] + 1;
            } else {
                pre = map.get(c) + 1;
                dp[i] = i - map.get(c);
            }
            map.put(c, i);
            if (dp[i] > ans) ans = dp[i];
        }
        return ans;
    }

}
