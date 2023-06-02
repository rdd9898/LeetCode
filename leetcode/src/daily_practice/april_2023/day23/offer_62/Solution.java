package daily_practice.april_2023.day23.offer_62;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 62. 圆圈中最后剩下的数字
 * @author: Mr.Hu
 * @create: 2023-04-23 21:21
 **/
public class Solution {

    public int lastRemaining(int n, int m) {
        int f = 0;
        for (int i = 2; i <= n; i++) {
            f = (m + f) % i;
        }
        return f;
    }

}
