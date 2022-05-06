package daily_practice.undefined_2022.hy4.day09;

/**
 * @program: LeetCode
 * @description: 905.按奇偶排序数组
 * @author: Mr.Hu
 * @create: 2022-04-28 09:16
 **/
public class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] answers = new int[n];
        int aIndex = 0;
        int bIndex = n-1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                answers[aIndex] = nums[i];
                aIndex++;
            } else {
                answers[bIndex] = nums[i];
                bIndex--;
            }
        }
        return answers;
    }

}
