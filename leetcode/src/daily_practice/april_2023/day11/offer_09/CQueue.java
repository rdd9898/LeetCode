package daily_practice.april_2023.day11.offer_09;


import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 09. 用两个栈实现队列
 * @author: Mr.Hu
 * @create: 2023-04-11 15:04
 **/
public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        this.stack1.push(value);
    }

    public int deleteHead() {
        if (this.stack2.empty()) {
            if (this.stack1.empty()) return -1;
            while (!this.stack1.empty()) {
                this.stack2.push(this.stack1.pop());
            }
        }
        return stack2.pop();
    }

}
