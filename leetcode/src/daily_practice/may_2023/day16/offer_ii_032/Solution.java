package daily_practice.may_2023.day16.offer_ii_032;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 032. 有效的变位词
 * @author: Mr.Hu
 * @create: 2023-05-16 20:07
 **/
public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) return false;
        int[] records = new int[26];
        for (char c : s.toCharArray()) {
            records[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            records[c - 'a']--;
        }
        for (int record : records) {
            if (record != 0) return false;
        }
        return true;
    }

}
