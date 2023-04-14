package daily_practice.april_2023.day07.question_201;

/**
 * @program: LeetCode
 * @description: 201.数字范围按位与
 * @author: Mr.Hu
 * @create: 2023-04-07 17:02
 **/
public class Solution {

    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            right >>= 1;
            left >>= 1;
            shift++;
        }
        return right << shift;
    }

}
