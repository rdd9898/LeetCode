package daily_practice.may_2023.day17.offer_ii_040;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 040. 矩阵中最大的矩形
 * @author: Mr.Hu
 * @create: 2023-05-17 19:10
 **/
public class Solution {

    public int maximalRectangle(String[] matrix) {
        int m = matrix.length;
        if (m == 0) return 0;
        int n = matrix[0].length();
        int[][] copyOfMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i].charAt(j) == '0') continue;
                if (i == 0) {
                    copyOfMatrix[i][j] = 1;
                } else {
                    copyOfMatrix[i][j] += copyOfMatrix[i - 1][j] + 1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int[] left = new int[n];
            int[] right = new int[n];
            Deque<Integer> deque = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                while (!deque.isEmpty() && copyOfMatrix[i][deque.peek()] >= copyOfMatrix[i][j]) {
                    deque.pop();
                }
                if (deque.isEmpty()) left[j] = -1;
                else left[j] = deque.peek();
                deque.push(j);
            }
            deque.clear();
            for (int j = n - 1; j >= 0; j--) {
                while (!deque.isEmpty() && copyOfMatrix[i][deque.peek()] >= copyOfMatrix[i][j]) {
                    deque.pop();
                }
                if (deque.isEmpty()) right[j] = n;
                else right[j] = deque.peek();
                deque.push(j);
            }
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, (right[j] - left[j] - 1) * copyOfMatrix[i][j]);
            }
        }
        return ans;
    }

}
