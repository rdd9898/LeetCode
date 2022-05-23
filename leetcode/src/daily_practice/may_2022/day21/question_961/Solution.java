package daily_practice.may_2022.day21.question_961;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 961.在长度 2N 的数组中找出重复 N 次的元素
 * @date 2022年05月22日 9:19
 */
public class Solution {

    public int repeatedNTimes(int[] nums) {
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                ans = nums[i];
                break;
            }
            list.add(nums[i]);
        }
        return ans;
    }

}
