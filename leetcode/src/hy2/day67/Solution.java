package hy2.day67;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 386.字典序排数
 * @date 2022年04月15日 10:14
 */
public class Solution {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int number = 1;
        // 时间复杂度为n
        for (int i = 0; i < n; i++) {
            ans.add(number);
            // 如果能*10则*10
            if (number * 10 <= n) {
                number *= 10;
            } else {
                // 不能*10，且末位为9或者+1大于n则回到前一位，即÷10
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                // 在该位+1
                number++;
            }
        }
        return ans;
    }

}
