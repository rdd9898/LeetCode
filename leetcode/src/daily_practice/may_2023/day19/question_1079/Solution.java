package daily_practice.may_2023.day19.question_1079;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1079. 活字印刷
 * @author: Mr.Hu
 * @create: 2023-05-19 15:26
 **/
public class Solution {

    private static final int MX = 8;
    private static final int[][] c = new int[MX][MX];

    static {
        for (int i = 0; i < MX; i++) {
            c[i][0] = c[i][i] = 1;
            for (int j = 1; j < i; j++)
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j]; // 预处理组合数
        }
    }

    public int numTilePossibilities(String tiles) {
        // 注：改成 int[26] 统计可能会快一点点，感兴趣可以试试（下面 DP 跳过 cnt=0 的情况）
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>(); // 统计每个字母的出现次数
        for (char c : tiles.toCharArray())
            counts.merge(c, 1, Integer::sum); // counts[c]++
        int[] f = new int[tiles.length() + 1];
        f[0] = 1; // 构造空序列的方案数
        int n = 0;
        for (int cnt : counts.values()) { // 枚举第 i 种字母
            n += cnt; // 常数优化：相比从 tiles.length() 开始要更快
            for (int j = n; j > 0; j--) // 枚举序列长度 j
                // 枚举第 i 种字母选了 k 个，注意 k=0 时的方案数已经在 f[j] 中了
                for (int k = 1; k <= j && k <= cnt; k++)
                    f[j] += f[j - k] * c[j][k];
        }
        int ans = 0;
        for (int j = 1; j <= n; j++)
            ans += f[j];
        return ans;
    }


}
