package daily_practice.undefined_2022.hy.day31;

public class Solution {
    public static int maxDepth(String s) {
        int answer = 0;
        int tmp = 0;
        for (char i: s.toCharArray()) {
            if (i == '(') {
                tmp++;
            }
            if (i == ')') {
                tmp--;
            }
            if (tmp > answer) {
                answer = tmp;
            }
        }
        return answer;
    }
}
