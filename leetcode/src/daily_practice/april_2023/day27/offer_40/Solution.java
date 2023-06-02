package daily_practice.april_2023.day27.offer_40;

/**
 * @program: LeetCode
 * @description: 剑指 Offer 44. 数字序列中某一位的数字
 * @author: Mr.Hu
 * @create: 2023-04-27 21:31
 **/
public class Solution {

    public int findNthDigit(int n) {
        if (n < 10) return n;
        int basis = 2;
        long num = 90;
        long prev = 10 + basis * num;
        while (prev < n) {
            basis++;
            num *= 10;
            prev += basis * num;
        }
        prev -= basis * num;
        n -= prev;
        int a = n / basis;
        int b = n % basis;
        char c = String.valueOf(num / 9 + a).charAt(b);
        return c - '0';
    }

}
