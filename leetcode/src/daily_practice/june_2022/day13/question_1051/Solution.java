package daily_practice.june_2022.day13.question_1051;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 1051.高度检查器
 * @date 2022年06月13日 9:06
 */
public class Solution {

    public int heightChecker(int[] heights) {
        int[] expceted = new int[heights.length];
        for(int i = 0; i < heights.length; i++) {
            expceted[i] = heights[i];
        }
        Arrays.sort(expceted);
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expceted[i]) {
                ans++;
            }
        }
        return ans;
    }

}
