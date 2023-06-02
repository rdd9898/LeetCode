package daily_practice.may_2023.day06.question_1419;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1419. 数青蛙
 * @author: Mr.Hu
 * @create: 2023-05-06 15:12
 **/
public class Solution {

    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] cur = new int[5];
        Map<Character, Integer> map = new HashMap<>();
        map.put('c', 0);
        map.put('r', 1);
        map.put('o', 2);
        map.put('a', 3);
        map.put('k', 4);
        int ans = -1;
        char[] chars = croakOfFrogs.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Integer index = map.get(chars[i]);
            cur[index]++;
            if (index != 0 && cur[index] > cur[index - 1]) return -1;
            if (chars[i] == 'k') {
                ans = Integer.max(ans, cur[0] - cur[4] + 1);
            }
        }
        for (int j = 1; j < 5; j++) {
            if (cur[j] != cur[j - 1]) {
                return -1;
            }
        }
        return ans;
    }

}
