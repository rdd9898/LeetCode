package daily_practice.april_2023.day06.question_1143;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonSubsequence() {
        String text1 = "bsbininm";
        String text2 = "jmjkbkjkv";
        Solution solution = new Solution();
        int ans = solution.longestCommonSubsequence(text1, text2);
        System.out.println(ans);
    }
}