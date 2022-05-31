package daily_practice.may_2022.day31.question_119;

import java.util.Arrays;
import java.util.List;

/**
 * 太牛了，利用滚动数组优化动态规划
 * @author 胡阳
 * @ClassName Solution
 * @description: 119.杨辉三角Ⅱ
 * @date 2022年05月31日 9:57
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        Arrays.fill(dp,1);
        for(int i = 2;i < dp.length;i++){
            for(int j = i - 1;j > 0;j--)
                dp[j] = dp[j] + dp[j - 1];
        }
        List<Integer> res = Arrays.asList(dp);
        return res;
    }

}
