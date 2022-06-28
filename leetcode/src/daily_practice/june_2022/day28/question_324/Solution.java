package daily_practice.june_2022.day28.question_324;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 324.摆动排序Ⅱ
 * @date 2022年06月28日 9:10
 */
public class Solution {

    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] temp = new int[n];
        int x = n - 1;
        int y = n / 2 - 1;
        if (n % 2 != 0) y++;
        for (int i = 0; i < n; i = i + 2) {
            temp[i] = nums[y];
            if (i + 1 >= n) break;
            temp[i + 1] = nums[x];
            y--;
            x--;
        }
        if (n % 2 != 0) temp[n - 1] = nums[0];
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

}
