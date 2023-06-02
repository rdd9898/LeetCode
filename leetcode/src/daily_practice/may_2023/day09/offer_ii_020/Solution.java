package daily_practice.may_2023.day09.offer_ii_020;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 020. 回文子字符串的个数
 * @author: Mr.Hu
 * @create: 2023-05-09 16:52
 **/
public class Solution {

    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ans++;
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        ans++;
        return ans;
    }

}
