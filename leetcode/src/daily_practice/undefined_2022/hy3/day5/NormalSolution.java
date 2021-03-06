package daily_practice.undefined_2022.hy3.day5;

import java.util.HashMap;
import java.util.Map;

//哈希表

public class NormalSolution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }

            map.put(num, i);
        }
        return false;
    }
}
