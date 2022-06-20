package daily_practice.june_2022.day20.question_1249;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1249.移除无效的括号
 * @date 2022年06月20日 9:44
 */
public class Solution {

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        List<Integer> deleteList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.isEmpty()) {
                    deleteList.add(i);
                    continue;
                } else {
                    deleteList.remove(deleteList.size() - 1);
                    stack.pop();
                }
            } else if (c == '(') {
                deleteList.add(i);
                stack.push(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!deleteList.contains(i)) sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
