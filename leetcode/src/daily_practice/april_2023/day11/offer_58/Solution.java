package daily_practice.april_2023.day11.offer_58;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 58 - II. 左旋转字符串
 * @author: Mr.Hu
 * @create: 2023-04-11 21:25
 **/
public class Solution {

    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(n, s.length());
        String s2 = s.substring(0, n);
        return s1 + s2;
    }

}
