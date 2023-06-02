package daily_practice.april_2023.day25.offer_59_ii;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 59 - II. 队列的最大值
 * @author: Mr.Hu
 * @create: 2023-04-25 20:06
 **/
public class MaxQueue {

    Deque<Integer> deque1;
    Deque<Integer> deque2;

    public MaxQueue() {
        deque1 = new ArrayDeque<>();
        deque2 = new ArrayDeque<>();
    }

    public int max_value() {
        if (deque1.size() == 0) return -1;
        else return deque2.peekFirst();
    }

    public void push_back(int value) {
        deque1.addLast(value);
        while (deque2.size() > 0 && deque2.peekLast() < value) {
            deque2.pollLast();
        }
        deque2.addLast(value);
    }

    public int pop_front() {
        if (deque1.size() == 0) {
            return -1;
        }
        if (deque2.peekFirst().equals(deque1.peekFirst())) {
            deque2.pollFirst();
        }
        return deque1.pollFirst();
    }

}
