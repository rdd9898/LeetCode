package daily_practice.may_2022.day28.question_1021;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: LeetCode
 * @description: 1021.删除最外层的括号
 * @author: Mr.Hu
 * @create: 2022-05-28 10:56
 **/
public class Solution {

    public String removeOuterParentheses(String s) {
        Deque<Character> deque = new LinkedList<>();
        char[] charArray = s.toCharArray();
        StringBuffer ans = new StringBuffer();
        deque.addFirst(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                deque.addFirst(charArray[i]);
            } else {
                deque.removeFirst();
            }
            if (deque.size() > 1 || (charArray[i] == ')' && deque.size() == 1)) {
                ans.append(charArray[i]);
            }
        }
        return ans.toString();
    }

}
