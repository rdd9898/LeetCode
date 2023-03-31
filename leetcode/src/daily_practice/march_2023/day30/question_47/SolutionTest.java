package daily_practice.march_2023.day30.question_47;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void permuteUnique() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        List<List<Integer>> ans = solution.permuteUnique(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}