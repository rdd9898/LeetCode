package daily_practice.undefined_2022.hy2.day61;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 762.二进制表示中质数个计算置位
 * @date 2022年04月05日 13:09
 */
public class Solution {

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            int number = Integer.bitCount(i);
            boolean prime = isPrime(number);
            if (prime) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
