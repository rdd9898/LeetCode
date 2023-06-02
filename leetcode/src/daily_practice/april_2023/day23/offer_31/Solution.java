package daily_practice.april_2023.day23.offer_31;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 31. 栈的压入、弹出序列
 * @author: Mr.Hu
 * @create: 2023-04-23 22:28
 **/
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        for (int j : pushed) {
            deque.push(j);
            while (deque.size() != 0 && deque.peek() == popped[index]) {
                deque.pop();
                index++;
            }
        }
        return index == popped.length;
    }

}
