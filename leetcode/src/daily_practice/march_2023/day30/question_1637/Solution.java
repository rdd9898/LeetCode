package daily_practice.march_2023.day30.question_1637;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: LeetCode
 * @description: 1637.两点之间不包含任何点的最宽垂直区域
 * @author: Mr.Hu
 * @create: 2023-03-30 16:17
 **/
public class Solution {

    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = Integer.MIN_VALUE;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < points.length - 1; i++) {
            ans = Integer.max(ans, points[i + 1][0] - points[i][0]);
        }
        return ans;
    }

}
