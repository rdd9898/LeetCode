package daily_practice.may_2023.day08.offer_ii_016;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 016. 不含重复字符的最长子字符串
 * @author: Mr.Hu
 * @create: 2023-05-08 20:05
 **/
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int ans = 1;
        int left = 0, right = 0;
        int length = s.length();
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        while (right < length - 1) {
            right++;
            if (set.contains(s.charAt(right))) {
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            } else set.add(s.charAt(right));
            ans = Integer.max(ans, right - left + 1);
        }
        return ans;
    }

}