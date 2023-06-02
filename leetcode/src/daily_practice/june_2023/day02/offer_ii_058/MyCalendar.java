package daily_practice.june_2023.day02.offer_ii_058;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 058. 日程表
 * @author: Mr.Hu
 * @create: 2023-06-02 16:29
 **/
public class MyCalendar {

    List<int[]> list;
    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (list.size() == 0) {
            list.add(new int[]{start, end});
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] >= end) {
                if (i == 0 || list.get(i - 1)[1] <= start) {
                    list.add(i, new int[]{start, end});
                    return true;
                } else return false;
            }
        }
        if (list.get(list.size() - 1)[1] <= start) {
            list.add(new int[]{start, end});
            return true;
        }
        return false;
    }
}
