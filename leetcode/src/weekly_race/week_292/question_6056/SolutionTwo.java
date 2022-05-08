package weekly_race.week_292.question_6056;

/**
 * @author 胡阳
 * @ClassName SolutionTwo
 * @description: 6056.字符串中最大的 3 位相同数字
 * @date 2022年05月08日 14:34
 */
public class SolutionTwo {


    public String largestGoodInteger(String num) {
        String res = "";
        int n = num.length();
        char[] cs = num.toCharArray();
        for (int i = 0; i + 2 < n; i++) {
            if (cs[i] == cs[i + 1] && cs[i + 1] == cs[i + 2]) {
                if (num.substring(i, i + 3).compareTo(res) > 0) res = num.substring(i, i + 3);
            }
        }
        return res;
    }

}
