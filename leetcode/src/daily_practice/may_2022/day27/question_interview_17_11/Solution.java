package daily_practice.may_2022.day27.question_interview_17_11;

/**
 * @author 胡阳
 * @ClassName Solution
 * @description: 面试题 17.11.单词距离
 * @date 2022年05月27日 9:23
 */
public class Solution {

    public int findClosest(String[] words, String word1, String word2) {
        int ans = Integer.MAX_VALUE;
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0, j = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                if (flag2) {
                    ans = Math.min(ans, i - j);
                    flag2 = false;
                }
                j = i;
                flag1 = true;
            } else if (words[i].equals(word2)) {
                if (flag1) {
                    ans = Math.min(ans, i - j);
                    flag1 = false;
                }
                j = i;
                flag2 = true;
            }
        }
        return ans;
    }

}
