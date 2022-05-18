package daily_practice.may_2022.day18.question_383;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 383.赎金信
 * @date 2022年05月18日 9:32
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] tmp1 = new int[26];
        int[] tmp2 = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            tmp1[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            tmp2[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (tmp2[i] < tmp1[i]) {
                return false;
            }
        }

        return true;
    }

}
