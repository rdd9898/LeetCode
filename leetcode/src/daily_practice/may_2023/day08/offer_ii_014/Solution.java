package daily_practice.may_2023.day08.offer_ii_014;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 014. 字符串中的变位词
 * @author: Mr.Hu
 * @create: 2023-05-08 16:35
 **/
public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] record = new int[27];
        for (char c : s1.toCharArray()) {
            record[c - 'a']++;
        }
        int windows = s1.length();
        int[] cur = new int[27];
        for (int i = 0; i < s2.length(); i++) {
            cur[s2.charAt(i) - 'a']++;
            if (i >= windows - 1) {
                if (Arrays.equals(cur, record)) return true;
                cur[s2.charAt(i - windows + 1) - 'a']--;
            }
        }
        return false;
    }

}
