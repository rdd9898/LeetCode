package daily_practice.april_2023.day11.offer_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 30. 包含min函数的栈
 * @author: Mr.Hu
 * @create: 2023-04-11 15:41
 **/
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty() || minStack.peek() > x) minStack.push(x);
        else minStack.push(minStack.peek());
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
