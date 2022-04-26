package hy.day02;
//372.超级次方
//你的任务是计算 a^b 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出。
public class Solution {
    static final int MOD = 1337;
    public long superPow(int a, int[] b) {
        int len = b.length;
        int x=0;
        int t;
        long res;
        for (int i=0; i<len; i++) {
            t = b[i] * (int)pow(10, len-i-1);
            x += t;
        }
        res = pow(a, x) % MOD;
        return res;
    }

    public long pow(int a, int b) {
        long res = 1;
        for (int i=0; i<b; i++) {
            res = res * a;
            System.out.println(res);
        }
//        System.out.println(res+"1");
        return res;
    }
}
