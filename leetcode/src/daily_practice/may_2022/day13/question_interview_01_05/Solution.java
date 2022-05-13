package daily_practice.may_2022.day13.question_interview_01_05;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 面试题 01.05.一次编辑
 * @date 2022年05月13日 10:15
 */
public class Solution {
    public boolean oneEditAway(String first, String second) {

        int m = first.length();
        int n = second.length();

        if (Math.abs(m - n) >= 2) {
            return false;
        }

        for (int i = 0; i < m && i < n; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (n == m + 1) {
                    if (first.substring(i, m).equals(second.substring(i + 1, n))) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (n == m - 1) {
                    if (first.substring(i + 1, m).equals(second.substring(i, n))) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    if (first.substring(i + 1, m).equals(second.substring(i + 1, n))) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
