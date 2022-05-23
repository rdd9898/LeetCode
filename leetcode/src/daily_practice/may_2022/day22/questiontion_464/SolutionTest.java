package daily_practice.may_2022.day22.questiontion_464;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void canIWin() {

        int maxChoosableInteger = 10;
        int desiredTotal = 11;
        Solution solution = new Solution();
        boolean ans = solution.canIWin(maxChoosableInteger, desiredTotal);
        System.out.println(ans);

    }
}