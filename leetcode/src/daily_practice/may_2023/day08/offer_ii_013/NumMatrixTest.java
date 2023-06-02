package daily_practice.may_2023.day08.offer_ii_013;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumMatrixTest {

    @Test
    public void sumRegion() {
        int[][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        int ans = numMatrix.sumRegion(1, 1, 2, 2);
        System.out.println(ans);
    }
}