package daily_practice.may_2022.day28.question_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序 + 二分查找
 * @program: LeetCode
 * @description: 15.三数之和
 * @author: Mr.Hu
 * @create: 2022-05-28 13:27
 **/
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    int cur = nums[mid] + nums[i] + nums[j];
                    if (cur < 0) {
                        left = mid + 1;
                    } else if (cur > 0) {
                        right = mid - 1;
                    } else {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[mid]);
                        if (!ans.contains(tmp)) ans.add(tmp);
                        break;
                    }
                }
            }
        }
        return ans;
    }

}
