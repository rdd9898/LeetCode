package daily_practice.april_2023.day20.offer_16;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 16. 数值的整数次方
 * @author: Mr.Hu
 * @create: 2023-04-20 15:58
 **/
public class Solution {

    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        double ans = 0;
        if (n % 2 == 0) {
            ans = myPow(x * x, n / 2);
        } else {
            ans = myPow(x * x, n / 2);
            if (n > 0) ans *= x;
            else ans *= 1 / x;
        }
        return ans;
    }

}
