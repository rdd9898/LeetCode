package daily_practice.undefined_2022.hy.day33;

//1576.替换所有的问号

//给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。
//
//注意：你 不能 修改非 '?' 字符。
//
//题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。
//
//在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。

//方法一：遍历扫描
//题目要求将字符串 s 中的 ‘?’ 转换为若干小写字母，转换后的字母与该字母的前后字母均不相同。遍历字符串 s，如果遇到第 i 个字符 s[i] 为 \‘?’ 时，此时直接在英文字母 ‘a’-‘z’ 中找到一个与 s[i-1] 和 s[i+1] 均不相同的字母进行替换即可。
//
//在替换时，实际不需要遍历所有的小写字母，只需要遍历三个互不相同的字母，就能保证一定找到一个与前后字符均不相同的字母，在此我们可以限定三个不同的字母为 (‘a’,‘b’,‘c’)。

public class Solution {
    public static String modifyString(String s) {
        int number = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < number; i++) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ch++) {
                    if ((i > 0 && arr[i-1] == ch) || (i < number-1 && arr[i+1] == ch)) {
                        continue;
                    }
                    arr[i] = ch;
                    break;
                }
            }
        }
        return new String(arr);
    }
}
