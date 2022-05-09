package daily_practice.may_2022.day09.question_225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 胡阳
 * @ClassName MyStack
 * @description: 225.用队列实现栈
 * @date 2022年05月09日 9:36
 */
public class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int ans = queue1.poll();
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        return ans;
    }

    public int top() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int ans = queue1.poll();
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        queue1.add(ans);
        return ans;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
