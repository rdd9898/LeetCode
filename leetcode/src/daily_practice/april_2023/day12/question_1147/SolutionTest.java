package daily_practice.april_2023.day12.question_1147;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestDecomposition() {
        String text = "aaa";
        Solution solution = new Solution();
        int ans = solution.longestDecomposition(text);
        System.out.println(ans);
    }
}