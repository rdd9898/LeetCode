package daily_practice.march_2023.day30.question_22;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 22.括号生成
 * @author: Mr.Hu
 * @create: 2023-03-30 21:29
 **/
public class Solution {

    List<String> ans = new ArrayList<>();
    StringBuffer temp = new StringBuffer();

    public List<String> generateParenthesis(int n) {
        dfs(n, n);
        return ans;
    }

    private void dfs(int left, int right) {
        if (left == right && left == 0) {
            ans.add(temp.toString());
            return;
        }
        if (left < right) {
            if (left != 0) {
                temp.append('(');
                dfs(left - 1, right);
                temp.deleteCharAt(temp.length() - 1);
            }
            temp.append(')');
            dfs(left, right - 1);
            temp.deleteCharAt(temp.length() - 1);
        } else {
            temp.append('(');
            dfs(left - 1, right);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

}
