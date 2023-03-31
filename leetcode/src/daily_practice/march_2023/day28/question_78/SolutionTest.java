package daily_practice.march_2023.day28.question_78;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subsets() {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.subsets(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}