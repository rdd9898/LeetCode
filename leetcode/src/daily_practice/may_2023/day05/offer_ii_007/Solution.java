package daily_practice.may_2023.day05.offer_ii_007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 005. 单词长度的最大乘积
 * @author: Mr.Hu
 * @create: 2023-05-05 21:21
 **/
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0) {
                while (i < nums.length - 2 && nums[i] == nums[i - 1]) i++;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] < 0) j++;
                else if (nums[i] + nums[j] + nums[k] > 0) k--;
                else {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(nums[k]);
                    ans.add(tmp);
                    while (j < nums.length - 1 && nums[j] == nums[j + 1]) j++;
                    while (k > i + 1 && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }

}
