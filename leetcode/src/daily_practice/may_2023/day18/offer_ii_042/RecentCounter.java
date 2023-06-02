package daily_practice.may_2023.day18.offer_ii_042;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 042. 最近请求次数
 * @author: Mr.Hu
 * @create: 2023-05-18 21:35
 **/
public class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) queue.poll();
        return queue.size();
    }
}
