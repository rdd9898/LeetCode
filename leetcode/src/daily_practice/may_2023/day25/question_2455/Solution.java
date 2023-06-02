package daily_practice.may_2023.day25.question_2455;

/**
 * @program: LeetCode
 * @description: 2455. 可被三整除的偶数的平均值
 * @author: Mr.Hu
 * @create: 2023-05-29 19:49
 **/
public class Solution {

    public int averageValue(int[] nums) {
        int sum = 0;
        int num = 0;
        for (int i : nums) {
            if (i % 6 == 0) {
                sum += i;
                num++;
            }
        }
        return num != 0 ? sum / num : 0;
    }
}
