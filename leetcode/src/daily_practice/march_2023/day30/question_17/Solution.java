package daily_practice.march_2023.day30.question_17;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 17.电话号码的字母组合
 * @author: Mr.Hu
 * @create: 2023-03-30 20:38
 **/
public class Solution {

    List<String> ans = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    List<String> dig = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;
        dig.add(0, "abc");
        dig.add(1, "def");
        dig.add(2, "ghi");
        dig.add(3, "jkl");
        dig.add(4, "mno");
        dig.add(5, "pqrs");
        dig.add(6, "tuv");
        dig.add(7, "wxyz");
        dfs(0, digits, digits.length());
        return ans;
    }

    private void dfs(int index, String digits, int length) {
        if (sb.length() == length) {
            ans.add(sb.toString());
            return;
        }
        String s = dig.get(digits.charAt(index) - '2');
        for (int j = 0; j < s.length(); j++) {
            sb.append(s.charAt(j));
            dfs(index + 1, digits, length);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
