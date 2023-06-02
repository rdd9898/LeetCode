package daily_practice.may_2023.day09.offer_ii_018;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 018. 有效的回文
 * @author: Mr.Hu
 * @create: 2023-05-09 15:46
 **/
public class Solution {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') sb.append(c);
            else if (c >= 'a' && c <= 'z') sb.append(c);
            else if (c >= 'A' && c <= 'Z') sb.append((char)(c + 32));
        }
        String ss = sb.toString();
        int right = ss.length() - 1;
        for (int left = 0; left < right; left++, right--) {
            if (ss.charAt(left) != ss.charAt(right)) return false;
        }
        return true;
    }

}
