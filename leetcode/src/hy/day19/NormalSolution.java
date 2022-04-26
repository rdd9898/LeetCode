package hy.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NormalSolution {
    /**
     * 优先队列 + 哈希表
     */
    public static int eatenApples(int[] apples, int[] days) {
        int len = apples.length;
        //记录有效的苹果过期日期数
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //每个过期日期剩余苹果数
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int idx = 0;
        //苹果树还能长苹果 或 还有未腐烂的苹果
        while (idx < len || !queue.isEmpty()) {
            //去掉过时的烂苹果
            while (!queue.isEmpty() && queue.peek() < idx) {
                map.remove(queue.poll());
            }
            //加入新苹果
            if (idx < len && apples[idx] > 0) {
                int lastEatDay = idx + days[idx] - 1;
                if (map.containsKey(lastEatDay)) {
                    map.put(lastEatDay, map.get(lastEatDay) + apples[idx]);
                } else {
                    map.put(lastEatDay, apples[idx]);
                    queue.add(lastEatDay);
                }
            }
            //开始吃苹果
            if (!queue.isEmpty()) {
                ans++;
                Integer eatDay = queue.poll();
                Integer count = map.get(eatDay);
                if (count > 1 && eatDay > idx) {
                    //苹果吃不完 且 苹果过期时间是今天之后
                    queue.add(eatDay);
                    map.put(eatDay, count - 1);
                } else {
                    //苹果吃完了 或 今天后这一批苹果过期
                    map.remove(eatDay);
                }
            }
            //下一天
            idx++;
        }
        return ans;
    }
}
