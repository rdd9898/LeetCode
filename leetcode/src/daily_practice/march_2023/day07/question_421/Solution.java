package daily_practice.march_2023.day07.question_421;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 421.数组中两个数的最大异或值
 * @author: Mr.Hu
 * @create: 2023-03-07 20:49
 **/
public class Solution {

    static final int HIGH_BIT = 30;
    /**
    * @Description: 不明白
    * @Param: [nums]
    * @return: int
    * @Author: HuYang
    * @Date: 2023/3/7
    */
    public int findMaximumXOR(int[] nums) {
        int ans = 0;
        Set<Integer> seen = new HashSet<>();
        for (int i = HIGH_BIT; i >= 0; i--) {
            for (int num : nums) {
                seen.add(num >> i);
            }
            int xNext = ans * 2 + 1;
            boolean found = false;
            for (int num : nums) {
                if (seen.contains(xNext ^ (num >> i))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                ans = xNext;
            } else {
                ans = xNext - 1;
            }
        }
        return ans;
    }

}
