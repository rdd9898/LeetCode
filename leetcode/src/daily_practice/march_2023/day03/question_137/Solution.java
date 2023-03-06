package daily_practice.march_2023.day03.question_137;

/**
 * @program: LeetCode
 * @description: 137.只出现一次的数字Ⅱ
 * @author: Mr.Hu
 * @create: 2023-03-02 22:18
 **/
public class Solution {

    /**
    * @Description: 将二进制上每一位的和对3取余，结果为目标元素在该位上的值
    * @Param: [nums]
    * @return: int
    * @Author: HuYang
    * @Date: 2023/3/2
    */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            int total = 0;
            for (int num: nums) {
                total += ((num >> i) & 1);
            }
            if (total % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }

}
