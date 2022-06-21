package daily_practice.june_2022.day21.question_1823;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findTheWinner() {
        int n = 5;
        int k = 2;
        Solution solution = new Solution();
        int ans = solution.findTheWinner(n, k);
        System.out.println(ans);
    }
}