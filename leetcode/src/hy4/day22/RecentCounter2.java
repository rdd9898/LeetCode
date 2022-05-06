package hy4.day22;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 使用队列
 * @author 胡阳
 * @ClassName RecentCounter2
 * @description: 933.最近的请求次数
 * @date 2022年05月06日 9:08
 */
public class RecentCounter2 {

    Queue<Integer> queue;

    public RecentCounter2() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);

        while (queue.peek() < (t - 3000)) {
            queue.poll();
        }

        return queue.size();
    }

}
