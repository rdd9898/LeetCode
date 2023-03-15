package daily_practice.march_2023.day14.question_127;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 127.单词接龙
 * @author: Mr.Hu
 * @create: 2023-03-14 16:58
 **/
public class Solution {

    /**
    * @Description: 通过 BFS 找最短路径
    * @Param: [beginWord, endWord, wordList]
    * @return: int
    * @Author: HuYang
    * @Date: 2023/3/14
    */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int ans = 0;
        boolean contains = wordList.contains(endWord);
        if (!contains) return 0;
        boolean[] flags = new boolean[wordList.size()];
        Deque<String> deque = new ArrayDeque<>();
        deque.offerFirst(beginWord);
        int size = 1;
        int tempSize = 0;
        while (deque.size() != 0) {
            String cur = deque.pollFirst();
            if (cur.equals(endWord)) return ans + 1;
            size--;
            if (size == 0) ans++;
            for (int i = 0; i < wordList.size(); i++) {
                if (flags[i]) continue;
                if (compareString(cur, wordList.get(i))) {
                    flags[i] = true;
                    tempSize++;
                    deque.offerLast(wordList.get(i));
                }
            }
            if (size == 0) {
                size = tempSize;
                tempSize = 0;
            }
        }
        return 0;
    }

    public boolean compareString(String s1, String s2) {
        int length = s1.length();
        int temp = 0;
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) temp++;
            if (temp == 2) return false;
        }
        return true;
    }

}
