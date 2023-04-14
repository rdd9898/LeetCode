package daily_practice.april_2023.day11.offer_04;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findNumberIn2DArray() {

//        int[][] matrix = {{1, 4, 7, 11, 15},
//                {2, 5, 8, 12, 19},
//                {3, 6, 9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}};
        int[][] matrix = {};
        Solution solution = new Solution();
        boolean ans = solution.findNumberIn2DArray(matrix, 5);
        System.out.println(ans);
    }
}