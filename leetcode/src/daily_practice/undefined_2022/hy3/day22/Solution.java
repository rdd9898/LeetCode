package daily_practice.undefined_2022.hy3.day22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/15 19:01
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] flags = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag1 = false;
                boolean flag2 = false;
                if (flags[i][j] == 1) {
                    continue;
                }
                for (int x = 0; x < n; x++) {
                    if (matrix[i][j] > matrix[i][x]) {
                        flag1 = true;
                    } else if (matrix[i][j] < matrix[i][x]){
                        flags[i][x] = 1;
                    }
                }
                for (int y = 0; y < m; y++) {
                    if (matrix[i][j] < matrix[y][j]) {
                        flag2 = true;
                    } else if (matrix[i][j] > matrix[y][j]){
                        flags[y][j] = 1;
                    }
                }
                if (!flag1 && !flag2) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
