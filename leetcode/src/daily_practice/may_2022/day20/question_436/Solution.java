package daily_practice.may_2022.day20.question_436;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 436.寻找右区间
 * @date 2022年05月20日 8:52
 */
public class Solution {

    public int[] findRightInterval(int[][] intervals) {

        int[] ans = new int[intervals.length];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < intervals.length; i++) {
            int left = i;
            int right = intervals.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (intervals[mid][0] >= intervals[i][1]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (left < intervals.length) {
                ans[map.get(intervals[i][0])] = map.get(intervals[left][0]);
            } else {
                ans[map.get(intervals[i][0])] = -1;
            }
        }

        return ans;

    }

}
