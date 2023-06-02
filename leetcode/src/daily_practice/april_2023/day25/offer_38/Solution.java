package daily_practice.april_2023.day25.offer_38;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 38. 字符串的排列
 * @author: Mr.Hu
 * @create: 2023-04-25 22:26
 **/
public class Solution {

    List<String> ans = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return ans.toArray(new String[ans.size()]);
    }

    private void dfs(int index) {
        if (index == c.length - 1) {
            ans.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = index; i < c.length; i++) {
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i, index);
            dfs(index + 1);
            swap(i, index);
        }
    }

    private void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

}
