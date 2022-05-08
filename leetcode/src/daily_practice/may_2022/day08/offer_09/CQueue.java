package daily_practice.may_2022.day08.offer_09;

import java.util.LinkedList;

/**
 * @author 胡阳
 * @ClassName CQueue
 * @description: offer 09.用两个栈实现队列
 * @date 2022年05月08日 10:09
 */
public class CQueue {

    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        while (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
