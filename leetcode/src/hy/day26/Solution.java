package hy.day26;

//507.完美数

//对于一个正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
//
//给定一个整数n，如果是完美数，返回 true，否则返回 false

public class Solution {
    /*
    * 每个数的正因子都在1到数/2范围中 依次寻找
    * */
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return true;
        }
        return false;
    }
}
