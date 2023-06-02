package daily_practice.may_2023.day08.question_1263;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minPushBox() {

        char[][] grid = {{'#','#','#','#','#','#'},
                        {'#','T','#','#','#','#'},
                        {'#','.','.','B','.','#'},
                        {'#','.','#','#','.','#'},
                        {'#','.','.','.','S','#'},
                        {'#','#','#','#','#','#'}};
        Solution solution = new Solution();
        int ans = solution.minPushBox(grid);
        System.out.println(ans);

    }
}