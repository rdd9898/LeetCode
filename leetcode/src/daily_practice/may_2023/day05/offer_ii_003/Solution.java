package daily_practice.may_2023.day05.offer_ii_003;

/**
 * @program: LeetCode
 * @description: 剑指 Offer II 003. 前 n 个数字二进制中 1 的个数
 * @author: Mr.Hu
 * @create: 2023-05-04 22:24
 **/
public class Solution {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        if (n == 0) return ans;
        ans[1] = 1;
        int pre = 2;
        for (int i = 2; i <= n; i++) {
            if (i == pre * 2) pre *= 2;
            ans[i] = 1 + ans[i - pre];
        }
        return ans;
    }

}
