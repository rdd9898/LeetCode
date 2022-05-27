package daily_practice.may_2022.day27.question_1482;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minDays() {

        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;
        Solution solution = new Solution();
        int ans = solution.minDays(bloomDay, m, k);
        System.out.println(ans);

    }
}