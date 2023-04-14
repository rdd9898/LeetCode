package daily_practice.april_2023.day04.question_55;

/**
 * @program: LeetCode
 * @description: 55.跳跃游戏
 * @author: Mr.Hu
 * @create: 2023-04-04 11:06
 **/
public class Solution {

    boolean ans = false;

    /**
    * @Description: 单纯使用 dfs 会导致超时
    * @Param: [nums]
    * @return: boolean
    * @Author: HuYang
    * @Date: 2023/4/4
    */
    public boolean canJump(int[] nums) {
        dfs(0, nums);
        return ans;
    }

    private void dfs(int index, int[] nums) {
        if (index >= nums.length - 1) {
            ans = true;
            return;
        }

        for (int i = 1; i <= nums[index]; i++) {
            dfs(index + i, nums);
            if (ans) return;
        }
    }

}
