package weekly_race.week_293.question_5234;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 麻了
 * @author 胡阳
 * @ClassName Solution
 * @description: 5234.移除字母异位词后的结果数组
 * @date 2022年05月15日 10:32
 */
public class Solution {

    /*
    * 爷太菜了
    * */
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        char[] pre = words[0].toCharArray();
        Arrays.sort(pre);
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char[] cur = words[i].toCharArray();
            Arrays.sort(cur);
            if (!Arrays.equals(cur, pre)) {
                ans.add(words[i]);
                pre = cur;
            }
        }
        return ans;
    }

}
