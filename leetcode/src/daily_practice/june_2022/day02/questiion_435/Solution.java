package daily_practice.june_2022.day02.questiion_435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 贪心算法，按照起点排序：选择结尾最短的，后面才可能连接更多的区间（如果两个区间有重叠，应该保留结尾小的）
 * 把问题转化为最多能保留多少个区间，使他们互不重复，则按照终点排序，每个区间的结尾很重要，结尾越小，则后面越有可能容纳更多的区间。
 * @author 胡阳
 * @ClassName Solution
 * @description: 435.无重叠区间
 * @date 2022年06月02日 9:54
 */
public class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0] == 0 ? o1[1] - o2[1] : o1[0] - o2[0];
            }
        });
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                if (intervals[i][1] < end) {
                    end = intervals[i][1];
                }
                ans++;
            } else {
                end = intervals[i][1];
            }
        }
        return ans;
    }

}
