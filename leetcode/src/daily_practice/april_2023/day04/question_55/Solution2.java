package daily_practice.april_2023.day04.question_55;

/**
 * @program: LeetCode
 * @description: 55.跳跃游戏
 * @author: Mr.Hu
 * @create: 2023-04-04 16:31
 **/
public class Solution2 {

    public boolean canJump(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index >= nums.length - 1) return true;
            else if (index < i) return false;
            index = Integer.max(nums[i] + i, index);
        }
        return false;
    }

}
