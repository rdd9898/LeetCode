package daily_practice.june_2022.day08.question_49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 49.字母异位词分组
 * @date 2022年06月08日 10:35
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (String str : strs) {
            int[] temp = new int[26];
            for (char c : str.toCharArray()) {
                temp[c - 'a']++;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i : temp) {
                stringBuffer.append(i);
                stringBuffer.append(',');
            }
            String s = stringBuffer.toString();
            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s, list);
            }
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

}
