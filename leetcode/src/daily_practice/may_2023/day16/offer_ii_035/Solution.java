package daily_practice.may_2023.day16.offer_ii_035;

import java.util.Collections;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 035. 最小时间差
 * @author: Mr.Hu
 * @create: 2023-05-16 21:12
 **/
public class Solution {

    int MAX_TIME = 24 * 60;

    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 24 * 60) return 0;
        Collections.sort(timePoints);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < timePoints.size() - 1; i++) {
            String s1 = timePoints.get(i);
            String s2 = timePoints.get(i + 1);
            String[] split1 = s1.split(":");
            String[] split2 = s2.split(":");
            int time1 = Integer.parseInt(split1[0]) * 60 + Integer.parseInt(split1[1]);
            int time2 = Integer.parseInt(split2[0]) * 60 + Integer.parseInt(split2[1]);
            res = Integer.min(res, time2 - time1);
        }
        String s1 = timePoints.get(0);
        String s2 = timePoints.get(timePoints.size() - 1);
        String[] split1 = s1.split(":");
        String[] split2 = s2.split(":");
        int time1 = Integer.parseInt(split1[0]) * 60 + Integer.parseInt(split1[1]);
        int time2 = Integer.parseInt(split2[0]) * 60 + Integer.parseInt(split2[1]);
        res = Integer.min(res, MAX_TIME - time2 + time1);
        return res;
    }

}
