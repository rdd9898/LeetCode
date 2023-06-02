package daily_practice.may_2023.day05.offer_ii_004;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 004. 只出现一次的数字
 * @author: Mr.Hu
 * @create: 2023-05-05 16:18
 **/
public class Solution {

    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for (int num : nums) {
            one = one ^ num & ~two;
            two = two ^ num & ~one;
        }
        return one;
    }

}
