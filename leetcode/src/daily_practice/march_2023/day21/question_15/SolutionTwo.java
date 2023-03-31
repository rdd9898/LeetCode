package daily_practice.march_2023.day21.question_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 15.三数之和
 * @author: Mr.Hu
 * @create: 2023-03-22 20:17
 **/
public class SolutionTwo {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = length - 1;
            while (j < k) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                if (k < length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[i] + nums[j] + nums[k] > 0) k--;
                else if (nums[i] + nums[j] + nums[k] < 0)  j++;
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    k--;
                    j++;
                }
            }

        }
        return ans;
    }

}
