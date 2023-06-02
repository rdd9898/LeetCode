package daily_practice.may_2023.day18.offer_ii_041;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 041. 滑动窗口的平均值
 * @author: Mr.Hu
 * @create: 2023-05-18 21:21
 **/
public class MovingAverage {

    Deque<Integer> deque;
    int size;
    int sum;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        deque = new ArrayDeque<>();
        this.size = size;
        sum = 0;
    }

    public double next(int val) {
        if (deque.size() < size) {
            deque.addFirst(val);
            sum += val;
            return (double) sum / deque.size();
        }
        int delete = deque.pollLast();
        deque.addFirst(val);
        sum -= delete;
        sum += val;
        return (double) sum / size;
    }

}
