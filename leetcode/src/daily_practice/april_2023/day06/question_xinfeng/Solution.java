package daily_practice.april_2023.day06.question_xinfeng;

/**
 * @program: LeetCode
 * @description:
 * @author: Mr.Hu
 * @create: 2023-04-06 09:58
 **/
public class Solution {

    int temp;

    public int[] allPossibilities(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp = 0;
            boolean[] flag = new boolean[nums[i]];
            dfs(0, flag, nums[i]);
            ans[i] = temp;
        }
        return ans;
    }

    private void dfs(int index, boolean[] flag, int num) {
        if (index == num) {
            temp++;
            return;
        }
        for (int i = 0; i < num; i++) {
            if (flag[i] || i == index) continue;
            flag[i] = true;
            dfs(index + 1, flag, num);
            flag[i] = false;
        }
    }

}
