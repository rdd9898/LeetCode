package com.hy.day11;

/**
 * @author ：HuYang
 * @date ：Created in 2022/2/1 0:42
 * @description：
 * @modified By：
 * @version: $
 */
public class Solution {
    public static String longestNiceSubstring(String s) {
        char[] chars = s.toCharArray();
        int flag;
        char[] answer = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            flag = 0;
            answer[0] = chars[i];
            for (int j = i + 1; j < chars.length; j++) {
                if ((chars[i] + 32 == chars[j]) || (chars[j] + 32 == chars[i])) {
                    answer[j - i] = chars[j];
                    flag = 1;
                } else if (flag == 1 && (chars[i] == chars[j])) {
                    answer[j - i] = chars[j];
                } else if (flag == 0){
                    answer.clone();
                    break;
                } else if (flag == 1){
                    return new String(answer).replaceAll("\\u0000", "");
                }
                if (j == chars.length - 1 && flag == 1) {
                    return new String(answer).replaceAll("\\u0000", "");
                }
            }
        }
        return new String().replaceAll("\\u0000", "");
    }
}
