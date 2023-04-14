package daily_practice.april_2023.day06.question_322;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void coinChange() {
        Solution solution = new Solution();
        int[] coins = {2, 5};
        int amount = 3;
        int ans = solution.coinChange(coins, amount);
        System.out.println(ans);
    }
}