package daily_practice.undefined_2022.hy2.day70;

import java.util.*;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 398.随机数索引
 * @date 2022年04月25日 9:23
 */
public class Solution {

    Map<Integer, List<Integer>> map;
    Random random;

    public Solution(int[] nums) {

        map = new HashMap<>();
        random = new Random();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
            }
        }

    }

    public int pick(int target) {
        List<Integer> list = map.get(target);
        int nextInt = random.nextInt(list.size());
        return list.get(nextInt);
    }
}
