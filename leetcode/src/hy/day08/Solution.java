package hy.day08;
//709.转换成小写字母
//给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。


public class Solution {
    //借助API
    //时间复杂度：O(n)，其中 n 是字符串 s 的长度。
    //空间复杂度：O(1)，不考虑返回值的空间占用。
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static String toLowerCaseTwo(String s) {
        char[] str = s.toCharArray();
        for (int i=0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'Z') {
                str[i] += 32;
            }
        }
        return new String(str);
    }

}
