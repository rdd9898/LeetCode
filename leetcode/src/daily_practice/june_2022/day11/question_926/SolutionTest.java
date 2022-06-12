package daily_practice.june_2022.day11.question_926;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minFlipsMonoIncr() {

        String s = "00011000";
        Solution solution = new Solution();
        int ans = solution.minFlipsMonoIncr(s);
        System.out.println(ans);

    }
}