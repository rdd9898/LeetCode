package daily_practice.april_2023.day05.question_139;

import java.util.List;

/**
 * @program: LeetCode
 * @description: 139.单词拆分
 * @author: Mr.Hu
 * @create: 2023-04-05 10:29
 **/
public class Solution {

    boolean[] bp;

    public boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        bp = new boolean[length];
        dfs(0, 0, s , wordDict, length);
        return bp[length - 1];

    }

    private void dfs(int begin, int end, String s, List<String> wordDict, int length) {
        if (bp[length - 1]) {
            return;
        }
        for (int i = end + 1; i <= length; i++) {
            if (wordDict.contains(s.substring(begin, i))) {
                if (bp[i - 1]) continue;
                bp[i - 1] = true;
                dfs(i, i, s, wordDict, length);
                if (bp[length - 1]) return;
            }
        }
    }

}
