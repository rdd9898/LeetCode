package daily_practice.march_2023.day23.question_1630;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 1630.等差子数组
 * @author: Mr.Hu
 * @create: 2023-03-23 21:02
 **/
public class Solution {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        int length = l.length;
        for (int i = 0; i < length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int num = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                max = Integer.max(max, nums[j]);
                min = Integer.min(min, nums[j]);
                num++;
            }
            int difference = (max - min) / (num - 1);
            int[] temp = new int[num];
            boolean flag = true;
            for (int j = l[i]; j <= r[i]; j++) {
                if (difference == 0) {
                    break;
                }
                if ((nums[j] - min) % difference != 0) {
                    ans.add(i, false);
                    flag = false;
                    break;
                } else {
                    if ((nums[j] - min) / difference >= num) {
                        ans.add(i, false);
                        flag = false;
                        break;
                    }
                    temp[(nums[j] - min) / difference]++;
                    if (temp[(nums[j] - min) / difference] > 1) {
                        ans.add(i, false);
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) ans.add(i, true);
        }
        return ans;
    }

}
