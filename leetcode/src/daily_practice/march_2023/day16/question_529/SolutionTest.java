package daily_practice.march_2023.day16.question_529;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void updateBoard() {

        Solution solution = new Solution();
        char[][] board = {{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
        int[] click = {3, 0};
        char[][] board1 = solution.updateBoard(board, click);
        for (char[] chars : board1) {
            for (char c : chars) {
                System.out.println(c);
            }
        }

    }
}