package daily_practice.may_2022.day12.question_1337;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1337.矩阵中战斗力最弱的 K 行
 * @author: Mr.Hu
 * @create: 2022-05-12 20:44
 **/
public class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] records = new int[m];
        for (int i = 0; i < m; i++) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                int mid = left + (right - left);
                if (mat[i][mid] == 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            records[i] = left;
        }
        int[] ans = new int[k];
        int ansIndex = m - 1;
        for (int i = 0; i < m; i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int j = 0; j < m; j++) {
                if (records[j] >= max) {
                    index = j;
                    max = records[j];
                }
            }
            records[index] = -1;
            if (ansIndex <= k - 1)
                ans[ansIndex] = index;
            ansIndex--;
        }
        return ans;
    }

}
