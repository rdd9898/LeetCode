package daily_practice.march_2023.day30.question_79;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void exist() {
        Solution solution = new Solution();
        char[][] board = {{'A','B','C', 'E'},{'S','F','E', 'S'},{'A','D','E','E'}};
        boolean ans = solution.exist(board, "ABCESEEEFS");
        System.out.println(ans);
    }
}