package daily_practice.april_2023.day21.question_2413;

/**
 * @program: LeetCode
 * @description: 2413. 最小偶倍数
 * @author: Mr.Hu
 * @create: 2023-04-21 16:37
 **/
public class Solution {

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        else return 2 * n;
    }

}
