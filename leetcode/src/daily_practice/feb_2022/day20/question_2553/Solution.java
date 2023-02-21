package daily_practice.feb_2022.day20.question_2553;

import java.util.ArrayList;

/**
 * @program: LeetCode
 * @description: 2553.分割数组中数字的数位
 * @author: Mr.Hu
 * @create: 2023-02-20 22:00
 **/
public class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            while (temp % 10 != 0 || temp >= 10) {
                list.add(temp % 10);
                temp /= 10;
            }
            if (temp != 0) list.add(temp);
        }
        int[] ans = new int[list.size()];
        int idx = 0;
        for (int i = list.size() - 1; i >= 0; i--, idx++) {
            ans[idx] = list.get(i);
        }
        return ans;
    }
}
