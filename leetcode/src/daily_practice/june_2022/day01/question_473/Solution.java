package daily_practice.june_2022.day01.question_473;

import java.util.Arrays;

/**
 * 回溯法 + dfs
 * @author 胡阳
 * @ClassName Solution
 * @description: 473.火柴拼正方形
 * @date 2022年06月01日 9:11
 */
public class Solution {

    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
            sum += matchsticks[i];
        }
        int edge = sum / 4;
        if (sum % 4 != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }
        if (matchsticks[matchsticks.length - 1] > edge) {
            return false;
        }
        int[] edges = new int[4];
        return dfs(0, matchsticks, edges, edge);
    }

    public boolean dfs (int index, int[] matchsticks, int[] edges, int len) {
        if (index == matchsticks.length) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            edges[i] += matchsticks[index];
            if (edges[i] <= len && dfs(index + 1, matchsticks, edges, len)) {
                return true;
            }
            edges[i] -= matchsticks[index];
        }
        return false;
    }

}
