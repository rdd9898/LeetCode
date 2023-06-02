package daily_practice.may_2023.day09.offer_ii_019;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 019. 最多删除一个字符得到回文
 * @author: Mr.Hu
 * @create: 2023-05-09 16:06
 **/
public class Solution {

    public boolean validPalindrome(String s) {
        int right = s.length() - 1;
        for (int left = 0; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return check(s, left + 1, right) || check(s, left, right - 1);
            }
        }
        return true;
    }

    private boolean check(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}
