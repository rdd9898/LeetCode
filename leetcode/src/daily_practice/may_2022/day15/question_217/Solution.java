package daily_practice.may_2022.day15.question_217;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 217.存在重复元素
 * @date 2022年05月15日 10:27
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.getOrDefault(num, 0) == 1) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }

}
