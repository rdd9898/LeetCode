package daily_practice.may_2023.day17.offer_ii_040;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maximalRectangle() {
        String[] matrix = {"10100","10111","11111","10010"};
        Solution solution = new Solution();
        solution.maximalRectangle(matrix);
    }
}