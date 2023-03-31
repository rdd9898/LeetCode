package daily_practice.march_2023.day30.question_39;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void combinationSum() {
        int[] candidates = {2,5,2,1,2};
        int target = 5;
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum(candidates, target);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}