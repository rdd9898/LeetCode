package hy.day06;

import java.util.ArrayList;

//748.最短补全词

//给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出并返回 words 中的 最短补全词 。
//
//补全词 是一个包含 licensePlate 中所有的字母的单词。在所有补全词中，最短的那个就是 最短补全词 。
//
//在匹配 licensePlate 中的字母时：
//
//忽略licensePlate 中的 数字和空格 。
//不区分大小写。
//如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
//例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
//
//请你找出并返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 最靠前的 那个。

//自己写出
public class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String sLow = licensePlate.toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for (char c: sLow.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                stringBuffer.append(c);
            }
        }
        String s = stringBuffer.toString();
        int len = s.length();
        int i = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        for (String word: words) {
            i = 0;
            String ne = word;
            for (int x=0; x<word.length(); x++) {
                if (s.charAt(i) == word.charAt(x)) {
                    StringBuffer sb = new StringBuffer(word);
                    sb.replace(x,x+1, " ");
                    word = sb.toString();
                    i++;
                    x = -1;
                    if (i == len) {
                        arrayList.add(ne);
                        break;
                    }
                }
            }
        }

        String sAnswer = arrayList.get(0);
        len = arrayList.get(0).length();
        for (String word: arrayList) {
            if (word.length() < len) {
                sAnswer = word;
                len = word.length();
            }
        }

        return sAnswer;
    }
}
