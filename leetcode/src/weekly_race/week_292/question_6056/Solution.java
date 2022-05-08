package weekly_race.week_292.question_6056;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 6056.字符串中最大的 3 位相同数字
 * @date 2022年05月08日 10:33
 */
public class Solution {
    public String largestGoodInteger(String num) {
        char[] array = num.toCharArray();
        int[] ans = new int[10];
        boolean flag = false;
        for (int i = 0; i < num.length() - 2; i++) {
            if (array[i] == array[i+1] && array[i] == array[i+2]) {
                flag = true;
                ans[array[i] - '0'] = (array[i] - '0') * 111;
            }
        }
        if (!flag) {
            return "";
        }
        Arrays.sort(ans);
        if (String.valueOf(ans[9]).equals("0")) {
            return "000";
        }
        return String.valueOf(ans[9]);
    }
}
