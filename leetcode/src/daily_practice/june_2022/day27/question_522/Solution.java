package daily_practice.june_2022.day27.question_522;

/**
 * 枚举，暴力解
 * @author 胡阳
 * @ClassName Solution
 * @description: 522.最长特殊序列Ⅱ
 * @date 2022年06月27日 9:00
 */
public class Solution {

    public int findLUSlength(String[] strs) {
        int ans = -1;
        for (int i = 0; i < strs.length; i++) {
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (j == i) continue;
                if (isSub(strs[i], strs[j])) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans = Math.max(ans, strs[i].length());
            }
        }
        return ans;
    }
    public boolean isSub(String s1, String s2) {
        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == s1.charAt(j)) {
                j++;
            }
            if (j == s1.length()) {
                return true;
            }
        }
        return false;
    }

}
