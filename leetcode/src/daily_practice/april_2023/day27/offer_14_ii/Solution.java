package daily_practice.april_2023.day27.offer_14_ii;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 14- II. 剪绳子 II
 * @author: Mr.Hu
 * @create: 2023-04-27 16:38
 **/
public class Solution {

    int MOD = 1000000007;

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int b = n % 3;
        int a = n / 3;
        long ans = 1;
        for (int i = 1; i < a; i++) {
            ans = ans * 3 % MOD;
        }
        if (b == 0) return (int) (ans * 3 % MOD);
        if (b == 1) return (int) (ans * 4 % MOD);
        return (int) (ans * 6 % MOD);
    }

}
