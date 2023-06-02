package daily_practice.may_2023.day15.question_1072;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1072. 按列翻转得到最大值等行数
 * @author: Mr.Hu
 * @create: 2023-05-15 20:36
 **/
public class Solution {

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            char[] arr = new char[n];
            Arrays.fill(arr, '0');
            for (int j = 0; j < n; j++) {
                arr[j] = (char) ('0' + matrix[i][j] ^ matrix[i][0]);
            }
            String s = new String(arr);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            res = Integer.max(res, value);
        }
        return res;
    }

}
