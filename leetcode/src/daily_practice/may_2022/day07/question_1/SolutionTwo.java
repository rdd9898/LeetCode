package daily_practice.may_2022.day07.question_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetCode
 * @description: 1.两数之和
 * @author: Mr.Hu
 * @create: 2022-05-07 17:05
 **/
public class SolutionTwo {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

}
