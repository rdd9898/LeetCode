package daily_practice.may_2023.day16.offer_ii_034;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 034. 外星语言是否排序
 * @author: Mr.Hu
 * @create: 2023-05-16 20:39
 **/
public class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        if (words.length < 2) return true;
        for (int i = 1; i < words.length; i++) {
            if (!compare(words[i - 1], words[i], order)) return false;
        }
        return true;
    }

    private boolean compare(String s1, String s2, String order) {
        int length = Integer.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (order.indexOf(c1) > order.indexOf(c2)) return false;
            else if (order.indexOf(c1) < order.indexOf(c2)) return true;
        }
        return s1.length() <= s2.length();
    }

}
