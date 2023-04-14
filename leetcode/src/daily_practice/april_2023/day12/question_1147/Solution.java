package daily_practice.april_2023.day12.question_1147;

/**
 * @program: LeetCode
 * @description: 1147.段式回文
 * @author: Mr.Hu
 * @create: 2023-04-12 09:57
 **/
public class Solution {

    public int longestDecomposition(String text) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        int ans = 0;
        for (int i = 0, j = text.length() - 1; i < j; i++, j--) {
            sb1.append(text.charAt(i));
            sb2.append(text.charAt(j));
            sb2.reverse();
            if (sb1.toString().equals(sb2.toString())) {
                ans += 2;
                sb1.setLength(0);
                sb2.setLength(0);
            }
            sb2.reverse();
        }
        if (!sb1.toString().equals("") || text.length() % 2 == 1) ans++;
        return ans;
    }

}
