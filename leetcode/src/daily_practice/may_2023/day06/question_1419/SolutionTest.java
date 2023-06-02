package daily_practice.may_2023.day06.question_1419;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minNumberOfFrogs() {
        String croakOfFrogs = "crocakcroraoakk";
        Solution solution = new Solution();
        int ans = solution.minNumberOfFrogs(croakOfFrogs);
        System.out.println(ans);
    }
}