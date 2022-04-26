package hy.day38;
// 6.Z字形变换
/**
 * @author 胡阳
 * @ClassName Solution
 * @description:
 * @date 2022年03月01日 13:58
 */
public class Solution {
    public static String convert(String s, int numRows) {
        int n = s.length();
        int r = numRows;
        if (r == 1 || r >= n) {
            return s;
        }
        int t = r * 2 - 2;
        int c = (n + t - 1) / t * (r - 1);
        char[][] mat = new char[r][c];

        for (int i = 0, x = 0, y = 0; i < n; ++i) {
            mat[x][y] = s.charAt(i);
            if (i % t < r - 1) {
                ++x; // 向下移动
            } else {
                --x;
                ++y; // 向右上移动
            }
        }
        StringBuffer ans = new StringBuffer();
        for (char[] row : mat) {
            for (char ch : row) {
                if (ch != 0) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();

    }
}
