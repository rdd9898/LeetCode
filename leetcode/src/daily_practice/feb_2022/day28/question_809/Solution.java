package daily_practice.feb_2022.day28.question_809;

/**
 * @program: LeetCode
 * @description: 809.情感丰富的文字
 * @author: Mr.Hu
 * @create: 2023-02-28 19:25
 **/
public class Solution {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;
        for (String word : words) {
            if (word.length() > s.length()) {
                continue;
            }
            for (int i = 0, j = 0; i < word.length() && j < s.length();) {
                char c = word.charAt(i);
                int flag = 0;
                while (j < s.length() && c == s.charAt(j)) {
                    j++;
                    flag++;
                }
                int flag2 = 0;
                while (i < word.length() && c == word.charAt(i)) {
                    i++;
                    flag2++;
                }
                if (flag <= 2 && flag != flag2 || flag2 > flag) break;
                if (j == s.length() && i == word.length()) ans++;
            }
        }
        return ans;
    }
}
