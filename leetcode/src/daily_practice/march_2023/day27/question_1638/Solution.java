package daily_practice.march_2023.day27.question_1638;

/**
 * @program: LeetCode
 * @description: 1638.统计只差一个字符的字串数目
 * @author: Mr.Hu
 * @create: 2023-03-27 20:25
 **/
public class Solution {

    public int countSubstrings(String s, String t) {
        int ans = 0;
        int length = s.length();
        int length2 = t.length();
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j + i <= length; j++) {
                String s1 = s.substring(j, j + i);
                for (int k = 0; k + i <= length2; k++) {
                    String s2 = t.substring(k, k + i);
                    if (compareString(s1, s2)) ans++;
                }
            }
        }
        return ans;
    }

    public boolean compareString(String x, String y) {
        int length = x.length();
        int temp = 0;
        for (int i = 0; i < length; i++) {
            if (x.charAt(i) != y.charAt(i)) temp++;
            if (temp > 1) return false;
        }
        return temp != 0;
    }

}
