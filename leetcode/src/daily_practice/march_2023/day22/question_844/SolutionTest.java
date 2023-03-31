package daily_practice.march_2023.day22.question_844;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void backspaceCompare() {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        Solution solution = new Solution();
        boolean ans = solution.backspaceCompare(s, t);
        System.out.println(ans);
    }
}