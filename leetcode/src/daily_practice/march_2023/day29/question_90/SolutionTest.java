package daily_practice.march_2023.day29.question_90;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void subsetsWithDup() {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.subsetsWithDup(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}