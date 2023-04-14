package daily_practice.april_2023.day13.question_2404;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 2404. 出现最频繁的偶数元素
 * @author: Mr.Hu
 * @create: 2023-04-13 19:59
 **/
public class Solution {

    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        int max = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > max) {
                    max = map.get(num);
                    ans = num;
                } else if (map.get(num) == max) {
                    if (ans > num) ans = num;
                }
            }
        }
        return ans;
    }

}
