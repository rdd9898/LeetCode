package daily_practice.may_2022.day09.question_942;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 942.增减字符串匹配
 * @date 2022年05月09日 9:14
 */
public class Solution {

    public int[] diStringMatch(String s) {
        int n = s.length() + 1;
        int[] ans = new int[n];
        int mix = 0;
        int max = s.length();
        for (int i = 0; i < (n - 1); i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = mix;
                mix++;
            } else {
                ans[i + 1] = ans[i] - 1;
                ans[i] = max;
                max--;
            }
        }
        ans[n - 1] = max;
        return ans;
    }

}
