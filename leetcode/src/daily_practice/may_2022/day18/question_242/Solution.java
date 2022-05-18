package daily_practice.may_2022.day18.question_242;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 242.有效的字母异位词
 * @date 2022年05月18日 9:35
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        int[] tmp1 = new int[26];
        int[] tmp2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            tmp1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tmp2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (tmp2[i] != tmp1[i]) {
                return false;
            }
        }

        return true;
    }

}
