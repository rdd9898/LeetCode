package daily_practice.april_2023.day20.offer_15;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 15. 二进制中1的个数
 * @author: Mr.Hu
 * @create: 2023-04-20 20:17
 **/
public class Solution {

    public int hammingWeight(int n) {
        int ans = 0;
        int index = 1;
        while (n != 0 && index <= 32) {
            index++;
            int temp = n;
            n = n >> 1;
            n = n << 1;
            if (n != temp) ans++;
            n = n >> 1;
        }
        return ans;
    }

}
