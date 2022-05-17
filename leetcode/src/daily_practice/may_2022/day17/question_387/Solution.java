package daily_practice.may_2022.day17.question_387;

import java.util.Arrays;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 387.字符串中第一个唯一字符
 * @date 2022年05月17日 11:21
 */
public class Solution {

    public int firstUniqChar(String s) {

        int[] letter = new int[26];
        Arrays.fill(letter, -2);

        for (int i = 0; i < s.length(); i++) {
            int index = letter[s.charAt(i) - 'a'];
            if (index >= 0) {
                letter[s.charAt(i) - 'a'] = -1;
            }
            if (index == -2) {
                letter[s.charAt(i) - 'a'] = i;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] >= 0) {
                if (letter[i] < ans) {
                    ans = letter[i];
                }
            }
        }
        if(ans < s.length()) {
            return ans;
        } else {
            return -1;
        }
    }

}
