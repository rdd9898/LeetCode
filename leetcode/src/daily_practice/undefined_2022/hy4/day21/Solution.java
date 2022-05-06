package daily_practice.undefined_2022.hy4.day21;

/**
 * @program: LeetCode
 * @description: 面试题05.07.配对交换
 * @author: Mr.Hu
 * @create: 2022-05-05 22:59
 **/
public class Solution {

    public int exchangeBits(int num) {

        return (0b01010101010101010101010101010101 & num) << 1
                | (0b10101010101010101010101010101010 & num) >> 1;

    }

}
