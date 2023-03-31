package daily_practice.march_2023.day21.question_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 15.三数之和
 * @author: Mr.Hu
 * @create: 2023-03-21 21:56
 **/
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (nums[i] + nums[j] + nums[mid] < 0) {
                        left = mid + 1;
                    } else if (nums[i] + nums[j] + nums[mid] > 0) {
                        right = mid - 1;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[mid]);
                        ans.add(temp);
                        break;
                    }
                }
            }
        }
        return ans;
    }

}
