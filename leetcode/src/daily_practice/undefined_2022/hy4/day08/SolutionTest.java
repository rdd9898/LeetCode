package daily_practice.undefined_2022.hy4.day08;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void pacificAtlantic() {
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        Solution solution = new Solution();
        List<List<Integer>> answers = solution.pacificAtlantic(heights);
        answers.forEach(System.out::println);
    }
}