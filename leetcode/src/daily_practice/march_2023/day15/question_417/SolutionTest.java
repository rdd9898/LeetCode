package daily_practice.march_2023.day15.question_417;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void pacificAtlantic() {
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.pacificAtlantic(heights);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}