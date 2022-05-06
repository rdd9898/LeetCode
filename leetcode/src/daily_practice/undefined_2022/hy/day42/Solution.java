package daily_practice.undefined_2022.hy.day42;
// 2055.蜡烛之间的盘子
/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月08日 14:38
 */
public class Solution {
    public static int[] platesBetweenCandles(String s, int[][] queries) {
        char[] array = s.toCharArray();
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int ans = 0;
            boolean flag1 = false;
            boolean flag2 = false;
            for (int j = a; j <= b; j++) {
                if (array[j] == '|') {
                    if (!flag1 && !flag2) {
                        flag1 = true;
                    }
                    if (flag1 && !flag2) {
                        res[i] += ans;
                        ans = 0;
                    }
                } else {
                    if (flag1) {
                        ans++;
                    }
                }
            }
        }
        return res;
    }
}
