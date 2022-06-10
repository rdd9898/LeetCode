package daily_practice.june_2022.day10.question_187;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 187.重复的 DNA 序列
 * @date 2022年06月10日 9:31
 */
public class Solution {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Set<String> res = new HashSet<>();
        if (s.length() <= 10) return ans;
        for (int i = 0; i <= s.length() - 10; i++) {
            String str = s.substring(i, i + 10);
            if (set.contains(str)) res.add(str);
            else set.add(str);
        }
        for (String re : res) {
            ans.add(re);
        }
        return ans;
    }

}
