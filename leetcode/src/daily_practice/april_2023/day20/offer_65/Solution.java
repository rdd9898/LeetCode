package daily_practice.april_2023.day20.offer_65;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 65. 不用加减乘除做加法
 * @author: Mr.Hu
 * @create: 2023-04-20 20:34
 **/
public class Solution {

    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a = a ^ b;
            b = c;
        }
        return a;
    }

}
