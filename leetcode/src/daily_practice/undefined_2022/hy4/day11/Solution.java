package daily_practice.undefined_2022.hy4.day11;

/**
 * @program: LeetCode
 * @description: 908.最小插值Ⅰ
 * @author: Mr.Hu
 * @create: 2022-04-30 11:49
 **/
public class Solution {

    public int smallestRangeI(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        if (max - min <= 2 * k) {
            return 0;
        } else {
            return max - min - 2 * k;
        }

    }

}
