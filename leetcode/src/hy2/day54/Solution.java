package hy2.day54;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 2028.找出缺失的观测数据
 * @date 2022年03月27日 10:52
 */
public class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] answers = new int[n];
        int num = (rolls.length + n) * mean;
        for (int i = 0; i < rolls.length; i++) {
            num -= rolls[i];
        }
        if (num > n * 6 || num < n) {
            return new int[0];
        }
        int a = num % n;
        int b = num / n;
        for (int i = 0; i < n; i++) {
            if (i < a) {
                answers[i] = b + 1;
            } else {
                answers[i] = b;
            }
        }
        return answers;
    }
}
