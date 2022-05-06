package daily_practice.undefined_2022.hy.day19;

//1705.吃苹果的最大数目

//有一棵特殊的苹果树，一连 n 天，每天都可以长出若干个苹果。在第 i 天，树上会长出 apples[i] 个苹果，这些苹果将会在 days[i] 天后（也就是说，第 i + days[i] 天时）腐烂，变得无法食用。也可能有那么几天，树上不会长出新的苹果，此时用 apples[i] == 0 且 days[i] == 0 表示。
//
//你打算每天 最多 吃一个苹果来保证营养均衡。注意，你可以在这 n 天之后继续吃苹果。
//
//给你两个长度为 n 的整数数组 days 和 apples ，返回你可以吃掉的苹果的最大数目。

import java.util.*;

public class Solution {
    public static int eatenApples(int[] apples, int[] days) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(days[0], apples[0]);

        int maxDay = 0;
        for (int i = 0; i < days.length; i++) {
            if (i + days[i] > maxDay) {
                maxDay = i + days[i];
            }
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(days[0]);

        int i = 1;
        int apple = 0;



        while (i <= maxDay) {
            //去掉烂苹果
            if (map.get(queue.peek()) != null){
                while (queue.peek() < i) {
                    map.remove(queue.poll());
                }

                if (i >= days.length && queue.peek() == null) {
                    return apple;
                }
            }

            //吃当天的苹果 吃最快要腐烂的苹果
            while (true){
                if (map.get(queue.peek()) != null){
                    if (map.get(queue.peek()) == 0) {
                        map.remove(queue.poll());
                    }
                    else if (queue.size() == 0) {
                        break;
                    }
                    else {
                        map.put(queue.peek(), map.get(queue.peek()) - 1);
                        apple++;
                        break;
                    }
                } else {
                    break;
                }
            }
            //吃当天的苹果 吃最快要腐烂的苹果

//            for (int x = 0; x < tmp.size(); x++) {
//                int day = tmp.poll();
//                if (i <= day && map.get(day) > 0) {
//                    map.put(day, map.get(day) - 1);
//                    apple++;
//                    break;
//                }
//            }

//            for (int day: queue) {
//                if (i <= day && map.get(day) > 0) {
//                    map.put(day, map.get(day) - 1);
//                    apple++;
//                    break;
//                }
//            }
            i++;

            //增加下一天的新增的苹果
            if (i <= days.length) {
                if (map.containsKey(days[i - 1] + i - 1)) {
                    map.put(days[i - 1] + i - 1, map.get(days[i - 1] + i - 1) + apples[i-1]);
                } else {
                    queue.add(days[i - 1] + i - 1);
                    map.put(days[i - 1] + i - 1, apples[i-1]);
                }
            }
        }
        return apple;
    }
}
