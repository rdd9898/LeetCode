package daily_practice.june_2022.day12.question_890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 890.查找和替换模式
 * @author: Mr.Hu
 * @create: 2022-06-12 11:53
 **/
public class Solution {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n = pattern.length();
        List<String> ans = new ArrayList<>();
        Map<Character, Character> map = new HashMap<>();
        for (String word: words) {
            if (word.length() != n) continue;
            for (int i = 0; i < n; i++) {
                if (map.getOrDefault(pattern.charAt(i), '1') == '1') {
                    if (!map.containsValue(word.charAt(i))) {
                        map.put(pattern.charAt(i), word.charAt(i));
                    } else {
                        map.clear();
                        break;
                    }
                } else {
                    if (map.get(pattern.charAt(i)) != word.charAt(i)) {
                        map.clear();
                        break;
                    }
                }
                if (i == n - 1) {
                    map.clear();
                    ans.add(word);
                }
            }

        }
        return ans;
    }

}
