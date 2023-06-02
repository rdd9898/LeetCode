package daily_practice.april_2023.day21.offer_56_ii;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 56 - II. 数组中数字出现的次数 II
 * @author: Mr.Hu
 * @create: 2023-04-20 22:13
 **/
public class Solution {

    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }

}
