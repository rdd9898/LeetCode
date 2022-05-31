package daily_practice.may_2022.day31.question_48;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate() {

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution solution = new Solution();
        solution.rotate(matrix);

    }
}