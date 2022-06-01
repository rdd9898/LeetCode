package daily_practice.june_2022.day01.question_473;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void makesquare() {

        int[] matchsticks = {2,2,2,2,2,2,2,2};
        Solution solution = new Solution();
        boolean ans = solution.makesquare(matchsticks);
        System.out.println(ans);

    }
}