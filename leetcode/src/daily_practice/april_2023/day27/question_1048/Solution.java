package daily_practice.april_2023.day27.question_1048;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1048. 最长字符串链
 * @author: Mr.Hu
 * @create: 2023-04-27 11:19
 **/
public class Solution {

    public int longestStrChain(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int res = 0;
        for (String word : words) {
            map.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                if (map.containsKey(prev)) {
                    map.put(word, Math.max(map.get(word), map.get(prev) + 1));
                }
            }
            res = Math.max(res, map.get(word));
        }
        return res;
    }

}
