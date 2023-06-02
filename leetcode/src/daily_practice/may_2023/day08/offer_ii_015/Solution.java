package daily_practice.may_2023.day08.offer_ii_015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 015. 字符串中的所有变位词
 * @author: Mr.Hu
 * @create: 2023-05-08 17:12
 **/
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<>();
        int windows = p.length();
        int[] count = new int[26];
        for (int i = 0; i < windows; i++) {
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }

        int differ = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) differ++;
        }

        if (differ == 0) ans.add(0);

        for (int i = 0; i < s.length() - windows; i++) {
            if (count[s.charAt(i) - 'a'] == 1) differ--;
            else if (count[s.charAt(i) - 'a'] == 0) differ++;
            count[s.charAt(i) - 'a']--;

            if (count[s.charAt(i + windows) - 'a'] == -1) differ--;
            else if (count[s.charAt(i + windows) - 'a'] == 0) differ++;
            count[s.charAt(i + windows) - 'a']++;

            if (differ == 0) ans.add(i + 1);
        }

        return ans;
    }

}
