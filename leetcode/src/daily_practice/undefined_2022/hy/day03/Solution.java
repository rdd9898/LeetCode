package daily_practice.undefined_2022.hy.day03;
//1816.截断句子
//句子 是一个单词列表，列表中的单词之间用单个空格隔开，且不存在前导或尾随空格。每个单词仅由大小写英文字母组成（不含标点符号）。
//
//例如，"Hello World"、"HELLO" 和 "hello world hello world" 都是句子。
//给你一个句子 s 和一个整数 k，请你将 s 截断 ，使截断后的句子仅含 前 k 个单词。返回 截断 s 后得到的句子。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/truncate-sentence
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class Solution {
    public static String truncateSentence(String s, int k) {
        String[] stringSplit = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<k; i++) {
            if (i!=k-1) {
                sb.append(stringSplit[i]);
                sb.append(" ");
            }
            else {
                sb.append(stringSplit[i]);
            }
        }
        return sb.toString();
    }
}
