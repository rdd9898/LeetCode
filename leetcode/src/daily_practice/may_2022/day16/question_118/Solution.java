package daily_practice.may_2022.day16.question_118;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 118.杨辉三角
 * @date 2022年05月16日 10:04
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> numRowOne = new ArrayList<>();
        numRowOne.add(1);
        ans.add(numRowOne);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            for(int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    tmp.add(1);
                } else {
                    tmp.add(ans.get(i - 2).get(j - 2) + ans.get(i - 2).get(j - 1));
                }
            }
            ans.add(tmp);
        }
        return ans;
    }

}
