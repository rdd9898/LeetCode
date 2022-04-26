package com.hy.day31;

/**
 * @author ：HuYang
 * @date ：Created in 2022/3/24 9:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {

    static int[][] num = {{0,0}, {0,1}, {1,1}, {0,-1}, {1,0}, {1,-1}, {-1,0}, {-1,1}, {-1,-1}};

    public static int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int number = 0;
                int sum = 0;
                for (int[] index: num) {
                    if (i + index[0] >= 0 && i + index[0] < m && j + index[1] >= 0 && j + index[1] < n) {
                        sum += img[i + index[0]][j + index[1]];
                        number++;
                    }
                }
                ans[i][j] = sum/number;
            }
        }
        return ans;
    }

}
