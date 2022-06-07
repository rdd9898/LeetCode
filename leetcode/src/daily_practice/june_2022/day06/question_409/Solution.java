package daily_practice.june_2022.day06.question_409;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 409.最长回文串
 * @date 2022年06月06日 10:07
 */
public class Solution {

    public int longestPalindrome(String s) {
        int[] number = new int[52];
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                number[s.charAt(i) - 'a']++;
            } else {
                number[s.charAt(i) - 'A' + 26]++;
            }
        }
        boolean flag = false;
        int ans = 0;
        for (int i: number) {
            ans += (i / 2 * 2);
            if (i % 2 == 1) flag = true;
        }
        if (flag) ans++;
        return ans;
    }

}
