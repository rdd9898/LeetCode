package daily_practice.may_2022.day12.question_944;

/**
 * @program: LeetCode
 * @description: 944.删列造序
 * @author: Mr.Hu
 * @create: 2022-05-12 09:14
 **/
public class Solution {

    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int n = strs[0].length();
        int m = strs.length;
        for (int i = 0; i < n; i++) {
            char tmp = 'a';
            for (int j = 0; j < m; j ++) {
                if (strs[j].charAt(i) - tmp < 0) {
                    ans++;
                    break;
                }
                tmp = strs[j].charAt(i);
            }
        }
        return ans;
    }

}
