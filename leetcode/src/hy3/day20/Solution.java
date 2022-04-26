package com.hy.day20;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/13 5:09
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        int a = 1;
        int b = 1;
        int l = 2;
        int o = 2;
        int n = 1;
        int[] ballon = {1,1,2,2,1};
        int[] flags = new int[5];
        for (char c: text.toCharArray()) {
            if (c == 'a') {
                flags[0]++;
            } else if (c == 'b') {
                flags[1]++;
            } else if (c == 'l') {
                flags[2]++;
            } else if (c == 'o') {
                flags[3]++;
            } else if (c == 'n') {
                flags[4]++;
            }
        }
        for (int i = 0; i < 5; i++) {
            ans = Math.min(ans, flags[i]/ballon[i]);
        }
        return ans;
    }
}
