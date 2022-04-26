package hy.day03;

//思路与算法
//
//由题意可知，除了最后一个单词，每个单词后面都跟随一个空格。因此我们可以通过统计空格与句子结尾的数目来统计单词数count。
//当count=k时，将当前的下标记录到end，返回句子s在end处截断的句子。
//

//时间复杂度：O(N)O(N)，其中 NN 为句子 \textit{s}s 的长度。遍历整个字符串需要 O(N)O(N)。
//空间复杂度：O(1)O(1)。注意返回值不计入空间复杂度。

public class NormalSolution {
    public static String truncateSentence(String s, int k) {
        int n = s.length();
        int end = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (i == n || s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    end = i;
                    break;
                }
            }
        }
        return s.substring(0, end);
    }
}
