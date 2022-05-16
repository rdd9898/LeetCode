package daily_practice.may_2022.day16.question_566;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void matrixReshape() {

        int[][] mat = {{1,2},{3,4}};
        int r = 4;
        int c = 1;
        Solution solution = new Solution();
        solution.matrixReshape(mat, r, c);

    }
}