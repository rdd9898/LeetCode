package daily_practice.may_2022.day15.question_812;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void largestTriangleArea() {

        int[][] points = {{1,0},{1,2},{0,1},{2,1}};
        Solution solution = new Solution();
        double v = solution.largestTriangleArea(points);
        System.out.println(v);

    }
}