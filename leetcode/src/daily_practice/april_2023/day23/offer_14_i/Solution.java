package daily_practice.april_2023.day23.offer_14_i;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 14- I. 剪绳子
 * @author: Mr.Hu
 * @create: 2023-04-23 19:53
 **/
public class Solution {

    public int cuttingRope(int n) {
        if (n == 2) return 1;
        else if (n == 3) return 2;
        int ans = 4;
        for (int i = 5; i <= n; i++) {
            if (i % 3 == 1) ans = ans / 3 * 4;
            else ans = ans / 2 * 3;
        }
        return ans;
    }

}
