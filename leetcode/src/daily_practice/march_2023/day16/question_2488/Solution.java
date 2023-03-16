package daily_practice.march_2023.day16.question_2488;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 2488.统计中位数为 K 的子数组
 * @author: Mr.Hu
 * @create: 2023-03-16 10:05
 **/
public class Solution {

    /**
    * @Description: 通过前缀和和 HashMap 解决该问题
    * @Param: [nums, k]
    * @return: int
    * @Author: HuYang
    * @Date: 2023/3/16
    */
    public int countSubarrays(int[] nums, int k) {
        int length = nums.length;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        int index = -1;
        int difference = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == k) {
                index = i;
                flag = true;
            }

            if (flag) {
                if (nums[i] > k) {
                    difference++;
                } else if (nums[i] < k){
                    difference--;
                }
                map.put(difference, map.getOrDefault(difference, 0) + 1);
            }
        }
        difference = 0;
        for (int i = index; i >= 0; i--) {
            if (nums[i] > k) difference++;
            else if (nums[i] < k) difference--;
            ans += map.getOrDefault(- difference, 0) + map.getOrDefault(1 - difference, 0);
        }
        return ans;
    }

}
