package daily_practice.april_2023.day14.question_1023;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1023. 驼峰式匹配
 * @author: Mr.Hu
 * @create: 2023-04-14 16:08
 **/
public class Solution {

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            char[] chars = query.toCharArray();
            int index = 0;
            boolean flag = true;
            for (char c : chars) {
                if (flag && c == pattern.charAt(index)) {
                    index++;
                    if (index == pattern.length()) flag = false;
                    continue;
                }
                if (c >= 'A' && c <= 'Z') {
                    flag = true;
                    break;
                }
            }
            if (!flag) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }

}
