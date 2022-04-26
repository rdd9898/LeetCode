package com.hy.day7;

/**
 * @author ：HuYang
 * @date ：Created in 2022/1/22 9:06
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; ++i) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }
}
