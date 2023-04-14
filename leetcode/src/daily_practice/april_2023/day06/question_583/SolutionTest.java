package daily_practice.april_2023.day06.question_583;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minDistance() {
        String text1 = "leetcode";
        String text2 = "etco";
        Solution solution = new Solution();
        int ans = solution.minDistance(text1, text2);
        System.out.println(ans);
    }
}