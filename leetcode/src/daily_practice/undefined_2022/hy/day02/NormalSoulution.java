package daily_practice.undefined_2022.hy.day02;
//372.超级次方
//你的任务是计算 a^b 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
/*
*  两个基础知识
*   1.快速幂 a ^ 10 = a ^ 5^2
*   2.mod的分配法
*       (a*b) mod k = ((a mod k)*(b mod k)) mod k
*       证明：
*       a = Ak + B
*       b = Ck + D
*       a*b = ACKK + BCK + AKD + BD
*       (a*b) mod k = BD mod k
*       a mod k = B
*       b mod k = D
*       所以： (a*b) mod k = ((a mod k)*(b mod k)) mod k
*  求解思路：
*    a^1024 = a^1020 * a^4
*           = (a^102)^10 * a^4
*           = ((a^10)^10 * a^2)^10 * a^4
*           = (((a^1)^10 * a^0)^10 * a^2)^10 * a^4
* */
public class NormalSoulution {
    static final int MOD = 1337;

    public static int superPow(int a, int[] b) {
        int ans = 1;
        for (int i = b.length - 1; i >= 0; --i) {
            ans = (int) ((long) ans * pow(a, b[i]) % MOD);
            a = pow(a, 10);
        }
        return ans;
    }

    public static int pow(int x, int n) {
        int res = 1;
        while (n != 0) {
            if (n % 2 != 0) {
                res = (int) ((long) res * x % MOD);
            }
            x = (int) ((long) x * x % MOD);
            n /= 2;
        }
        return res;
    }

}
