package daily_practice.march_2023.day23.question_438;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 438.找到字符串中所有字母异位词
 * @author: Mr.Hu
 * @create: 2023-03-23 21:51
 **/
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) return ans;
        int length = p.length();
        int[] compare = new int[26];
        int[] temp = new int[26];
        for (int i = 0; i < length; i++) {
            compare[p.charAt(i) - 'a']++;
            temp[s.charAt(i) - 'a']++;
        }
        if (compareString(compare, temp)) ans.add(0);
        for (int i = length; i < s.length(); i++) {
            temp[s.charAt(i) - 'a']++;
            temp[s.charAt(i - length) - 'a']--;
            if (compareString(compare, temp)) ans.add(i - length + 1);
        }
        return ans;
    }

    public boolean compareString(int[] compare, int[] temp) {
        for (int i = 0; i < 26; i++) {
            if (compare[i] != temp[i]) return false;
        }
        return true;
    }

}
