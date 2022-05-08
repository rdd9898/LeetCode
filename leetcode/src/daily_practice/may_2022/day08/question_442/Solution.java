package daily_practice.may_2022.day08.question_442;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 442.数组中重复的数据
 * @date 2022年05月08日 9:24
 */
public class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == num) {
                list.add(num);
            }
            num = nums[i];
        }
        return list;
    }
}
