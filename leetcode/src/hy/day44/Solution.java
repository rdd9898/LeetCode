package hy.day44;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月11日 10:32
 */
public class Solution {
    static long maxScore = 0;
    static int cnt = 0;
    static int n;
    static List<Integer>[] children;

    public static int countHighestScoreNodes(int[] parents) {
        n = parents.length;
        children = new List[n];
        for (int i = 0; i < n; i++) {
            children[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            int p = parents[i];
            if (p != -1) {
                children[p].add(i);
            }
        }
        dfs(0);
        return cnt;
    }

    public static int dfs(int node) {
        long score = 1;
        int size = n - 1;
        for (int c : children[node]) {
            int t = dfs(c);
            score *= t;
            size -= t;
        }
        if (node != 0) {
            score *= size;
        }
        if (score == maxScore) {
            cnt++;
        } else if (score > maxScore) {
            maxScore = score;
            cnt = 1;
        }
        return n - size;
    }

}
