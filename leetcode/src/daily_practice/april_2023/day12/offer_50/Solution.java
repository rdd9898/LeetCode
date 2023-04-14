package daily_practice.april_2023.day12.offer_50;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 50. 第一个只出现一次的字符
 * @author: Mr.Hu
 * @create: 2023-04-12 11:10
 **/
public class Solution {

    public char firstUniqChar(String s) {
        int[] nums = new int[26];
        for (char c : s.toCharArray()) {
            nums[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (nums[c - 'a'] == 1) return c;
        }
        return ' ';
    }

}
