package com.hy.day8;

/**
 * @author ：HuYang
 * @date ：Created in 2022/1/25 16:45
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int numberOfMatches(int n) {
        int answer = 0;
        while (n != 1) {
            answer += n / 2;
            if (n % 2 == 1) {
                n += 1;
            }
            n = n / 2;
        }
        return answer;
    }
}
