package daily_practice.june_2022.day04.question_560;

import java.util.HashMap;

/**
 * 子数组即为连续子数组，注意：不能用滑动窗口，因为值可能为负数，滑动滑动窗口要有一个缩小的方向，
 * 该题使用前缀和 + 哈希表
 * @program: LeetCode
 * @description: 560.和为 K 的子数组
 * @author: Mr.Hu
 * @create: 2022-06-04 11:43
 **/
public class Solution {

    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int num: nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

}
