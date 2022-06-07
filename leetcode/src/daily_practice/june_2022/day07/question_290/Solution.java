package daily_practice.june_2022.day07.question_290;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 290.单词规律
 * @date 2022年06月07日 9:56
 */
public class Solution {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] splits = s.split(" ");
        if (splits.length != pattern.length()) {
            return false;
        }
        for(int i = 0; i < splits.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(splits[i])) {
                    return false;
                }
            } else  if (map.containsValue(splits[i])){
                return false;
            } else {
                map.put(pattern.charAt(i), splits[i]);
            }
        }
        return true;
    }

}
