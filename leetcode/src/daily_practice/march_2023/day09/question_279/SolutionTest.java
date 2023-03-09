package daily_practice.march_2023.day09.question_279;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numSquares() {
        int n = 7;
        Solution solution = new Solution();
        int ans = solution.numSquares(n);
        System.out.println(ans);
    }
}