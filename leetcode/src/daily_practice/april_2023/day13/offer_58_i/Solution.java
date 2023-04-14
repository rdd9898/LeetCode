package daily_practice.april_2023.day13.offer_58_i;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 58 - I. 翻转单词顺序
 * @author: Mr.Hu
 * @create: 2023-04-13 21:52
 **/
public class Solution {

    public String reverseWords(String s) {
        StringBuffer ans = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (sb.length() == 0) continue;
                ans.append(sb.reverse()).append(' ');
                sb.delete(0, sb.length());
            } else {
                sb.append(s.charAt(i));
            }
        }
        if (sb.length() != 0) ans.append(sb.reverse()).append(' ');
        if (ans.length() == 0) return ans.toString();
        return ans.deleteCharAt(ans.length() - 1).toString();
    }

}
