package daily_practice.june_2022.day03.question_829;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void consecutiveNumbersSum() {
        int n = 5;
        Solution solution = new Solution();
        int i = solution.consecutiveNumbersSum(5);
        System.out.println(i);
    }
}