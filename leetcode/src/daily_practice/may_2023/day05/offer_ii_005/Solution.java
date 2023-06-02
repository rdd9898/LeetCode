package daily_practice.may_2023.day05.offer_ii_005;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 005. 单词长度的最大乘积
 * @author: Mr.Hu
 * @create: 2023-05-05 20:11
 **/
public class Solution {

    public int maxProduct(String[] words) {
        List<Integer> list = new ArrayList<>();
        for (String word : words) {
            int tmp = 0;
            Set<Character> set = new HashSet<>();
            for (char c : word.toCharArray()) {
                if (set.contains(c)) {
                    continue;
                }
                set.add(c);
                tmp += (int) Math.pow(2, c - 'a');
            }
            list.add(tmp);
        }
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((list.get(i) & list.get(j)) == 0) {
                    ans = Integer.max(words[i].length() * words[j].length(), ans);
                }
            }
        }
        return ans;
    }

}
