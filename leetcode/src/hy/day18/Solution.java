package hy.day18;

//686.重复叠加字符串匹配

//给定两个字符串 a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
//
//注意：字符串 "abc"重复叠加 0 次是 ""，重复叠加 1 次是"abc"，重复叠加 2 次是"abcabc"。

/*
一个完整的字符串s最终是要包含b的，所以a在只能有以下几种情况：

b出现了a中没有的字符，返回-1；

b和a包含的字符是一致的，此时又分为：

情况1：a = 'abc', b = 'ab'，此时无需重复a，返回初始字符串；
情况2：a = 'abcd', b = 'cdabcdab'，此时对a重复，返回重复的字符串，因为最差情况下b必然是起始使用了a的一部分，结尾使用了a的一部分；
可以使用repeat函数，计算初始要重复的次数ret = b.len() / a.len()，得出中间填充a的个数，情况一被规避，然后再分别在左、右添加一个a，情况2被规避。
*/

public class Solution {
    public int repeatedStringMatch(String a, String b) {
        int[] ch = new int[26];
        for(char c: a.toCharArray()) {
            ch[c - 'a'] = 1;
        }

        for(char c: b.toCharArray()) {
            if(ch[c - 'a'] == 0) {
                return -1;
            }
        }
        int rep = b.length() / a.length();

        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < 3; i++) {
            if(sb.toString().contains(b)) {
                return rep + i;
            }
            sb.append(a);
        }




        return -1;
    }
}
