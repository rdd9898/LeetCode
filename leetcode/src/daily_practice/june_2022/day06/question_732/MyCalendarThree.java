package daily_practice.june_2022.day06.question_732;

import java.util.*;

/**
 * 查分数组 + TreeMap
 * @author 胡阳
 * @ClassName MyCalendarThree
 * @description: 732.我的日程安排表Ⅲ
 * @date 2022年06月06日 8:52
 */
public class MyCalendarThree {

    private TreeMap<Integer, Integer> cnt;

    public MyCalendarThree() {
        cnt = new TreeMap<Integer, Integer>();
    }

    public int book(int start, int end) {
        int ans = 0;
        int maxBook = 0;
        cnt.put(start, cnt.getOrDefault(start, 0) + 1);
        cnt.put(end, cnt.getOrDefault(end, 0) - 1);
        for (Map.Entry<Integer, Integer> entry: cnt.entrySet()) {
            int freq = entry.getValue();
            maxBook += freq;
            ans = Math.max(maxBook, ans);
        }
        return ans;
    }
}
