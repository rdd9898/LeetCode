package daily_practice.may_2022.day13.question_interview_01_05;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void oneEditAway() {
        String first = "b";
        String second = "";
        Solution solution = new Solution();
        boolean ans = solution.oneEditAway(first, second);
        System.out.println(ans);
    }
}