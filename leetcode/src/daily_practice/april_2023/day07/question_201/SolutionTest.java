package daily_practice.april_2023.day07.question_201;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rangeBitwiseAnd() {

        Solution solution = new Solution();
        int left = 5;
        int right = 7;
        int ans = solution.rangeBitwiseAnd(left, right);
        System.out.println(ans);

    }
}