package daily_practice.may_2022.day25.question_467;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计以每个字符作为结尾的最长连续序列(可以覆盖掉重复的短序列的情况), 他们的和即为所求
 * 例如:abcdbcd, 对于以d结尾的有abcd, bcd, cd和d, 而bcd产生的序列都会被abcd所覆盖
 * 总和即以 a、b、c 和 d 结尾的所有连续最长序列 1 + 2 + 3 + 4 = 10
 * @author 胡阳
 * @ClassName Solution
 * @description: 467.环绕字符串中唯一的子字符串
 * @date 2022年05月25日 9:32
 */
public class Solution {

    public int findSubstringInWraproundString(String p) {
        int[] count = new int[26];
        int n = p.length();
        char[] str = p.toCharArray();
        int curMaxLen = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && (str[i] - str[i - 1] == 1 || str[i - 1] - str[i] == 25)) {
                curMaxLen++;
            } else {
                curMaxLen = 1;
            }
            count[str[i] - 'a'] = Math.max(count[str[i] - 'a'], curMaxLen);
        }
        int ans = 0;
        for (int tmp: count) {
            ans += tmp;
        }
        return ans;
    }

}
