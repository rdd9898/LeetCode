package daily_practice.june_2022.day30.question_1175;

/**
 * @program: LeetCode
 * @description: 1175.质数排列
 * @author: Mr.Hu
 * @create: 2022-06-30 20:06
 **/
public class Solution {

    static final int MOD = 1000000007;

    public int numPrimeArrangements(int n) {
        int numPrimes = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                numPrimes++;
            }
        }
        return (int) (factorial(numPrimes) * factorial(n - numPrimes) % MOD);
    }

    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            res %= MOD;
        }
        return res;
    }

}
