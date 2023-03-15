package daily_practice.march_2023.day15.question_130;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solve() {
        Solution solution = new Solution();
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solution.solve(board);
    }

}