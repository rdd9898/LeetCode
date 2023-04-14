package daily_practice.april_2023.day05.question_2427;

/**
 * @program: LeetCode
 * @description: 2427.公因子的数目
 * @author: Mr.Hu
 * @create: 2023-04-05 15:40
 **/
public class Solution {

    public int commonFactors(int a, int b) {
        int ans = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) ans++;
        }
        return ans;
    }

}
