package daily_practice.june_2022.day21.question_1823;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 让数列转起来
 * @author 胡阳
 * @ClassName Solution
 * @description: 1823.找出游戏的获胜者
 * @date 2022年06月21日 8:58
 */
public class Solution {

    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }

}
