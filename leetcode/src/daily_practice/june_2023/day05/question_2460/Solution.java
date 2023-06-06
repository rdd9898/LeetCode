package daily_practice.june_2023.day05.question_2460;

/**
 * @program: LeetCode
 * @description: 2460. 对数组执行操作
 * @author: Mr.Hu
 * @create: 2023-06-05 19:47
 **/
public class Solution {

    public int[] applyOperations(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                nums[index] = nums[i] * 2;
                nums[i + 1] = 0;
            } else {
                nums[index] = nums[i];
            }
            index++;
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
