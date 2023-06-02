package daily_practice.may_2023.day16.offer_ii_036;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 036. 后缀表达式
 * @author: Mr.Hu
 * @create: 2023-05-16 21:37
 **/
public class Solution {

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) return Integer.parseInt(tokens[0]);
        Deque<String> deque = new ArrayDeque<>();
        for (String token : tokens) {
            deque.push(token);
        }
        String s = deque.poll();
        int ans = diGui(deque, s);
        return ans;
    }

    private int diGui(Deque<String> deque, String token) {
        int first;
        int second;
        if (token.equals("+")) {
            String s = deque.poll();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                first = diGui(deque, s);
            } else first = Integer.parseInt(s);
            String s2 = deque.poll();
            if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/")) {
                second = diGui(deque, s2);
            } else second = Integer.parseInt(s2);
            return first + second;
        } else if (token.equals("-")) {
            String s = deque.poll();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                first = diGui(deque, s);
            } else first = Integer.parseInt(s);
            String s2 = deque.poll();
            if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/")) {
                second = diGui(deque, s2);
            } else second = Integer.parseInt(s2);
            return second - first;
        } else if (token.equals("*")) {
            String s = deque.poll();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                first = diGui(deque, s);
            } else first = Integer.parseInt(s);
            String s2 = deque.poll();
            if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/")) {
                second = diGui(deque, s2);
            } else second = Integer.parseInt(s2);
            return second * first;
        } else {
            String s = deque.poll();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                first = diGui(deque, s);
            } else first = Integer.parseInt(s);
            String s2 = deque.poll();
            if (s2.equals("+") || s2.equals("-") || s2.equals("*") || s2.equals("/")) {
                second = diGui(deque, s2);
            } else second = Integer.parseInt(s2);
            return second / first;
        }
    }

}
