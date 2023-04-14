package daily_practice.april_2023.day11.question_149;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxPoints() {

        Solution solution = new Solution();
        int[][] points = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        int ans = solution.maxPoints(points);
        System.out.println(ans);

    }
}