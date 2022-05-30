package daily_practice.may_2022.day30.question_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 56.合并区间
 * @date 2022年05月30日 9:15
 */
public class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(intervals[0][0]);
        tmp.add(intervals[0][1]);
        for (int i = 1; i < intervals.length ; i++) {
            if (tmp.get(1) >= intervals[i][0]) {
                List<Integer> tmp2 = new ArrayList<>();
                tmp2.add(tmp.get(0));
                tmp2.add(Math.max(tmp.get(1), intervals[i][1]));
                tmp = tmp2;
                if (i == intervals.length - 1) {
                    ans.add(tmp);
                }
            } else {
                ans.add(tmp);
                List<Integer> tmp2 = new ArrayList<>();
                tmp = tmp2;
                tmp.add(intervals[i][0]);
                tmp.add(intervals[i][1]);
                if (i == intervals.length - 1) {
                    ans.add(tmp);
                }
            }
        }
        int[][] returnAns = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            returnAns[i][0] = ans.get(i).get(0);
            returnAns[i][1] = ans.get(i).get(1);
        }
        return returnAns;
    }

}
