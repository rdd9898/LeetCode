package daily_practice.may_2022.day17.question_36;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isValidSudoku() {

        char[][] board = {{'.','.','4','.','.','.','6','3','.'},{'.','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','9','.'},{'.','.','.','5','6','.','.','.','.'},{'4','.','3','.','.','.','.','.','1'},{'.','.','.','7','.','.','.','.','.'},{'.','.','.','5','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}};
        Solution solution = new Solution();
        boolean ans = solution.isValidSudoku(board);
        System.out.println(ans);


    }
}