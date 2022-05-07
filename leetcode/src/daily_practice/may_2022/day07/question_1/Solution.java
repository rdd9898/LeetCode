package daily_practice.may_2022.day07.question_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1.两数相和
 * @author: Mr.Hu
 * @create: 2022-05-07 14:30
 **/
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] answers = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, nums[i]);
        }
        for (int i = 0; i < n; i++) {
            int tmp = target - map.get(i);
            answers[0] = i;
            map.remove(i);
            if (map.containsValue(tmp)) {
                for (int j = 0; j < n; j++) {
                    if (j == i) {
                        continue;
                    }
                    if (tmp == map.get(j)) {
                        answers[1] = j;
                        return answers;
                    }
                }
                map.put(i, -1);
            }
            map.put(i, target - tmp);

        }
        return answers;
    }

}
