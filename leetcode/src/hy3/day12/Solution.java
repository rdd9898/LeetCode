package com.hy.day12;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/4 11:09
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int countGoodRectangles(int[][] rectangles) {
        int ans = 0;
        int min = Integer.MIN_VALUE;
        for (int[] i: rectangles) {
            int tmp = i[0] <= i[1] ? i[0] : i[1];
            if (tmp > min) {
                min = tmp;
                ans = 1;
            } else if (tmp == min) {
                ans++;
            }
        }
        return ans;
    }
}
